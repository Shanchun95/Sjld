package com.xcy.controller;

import com.xcy.jopo.Area;
import com.xcy.service.AreaService;
import com.xcy.utils.JedisClient;
import com.xcy.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/area")
public class RedisController {
    @Autowired
    private AreaService areaService;
    @Autowired
    private JedisClient jedisClient;

    @RequestMapping("/provinceServlet")
    @ResponseBody
    public List<Area> provinceServlet(){
        Boolean isExists = jedisClient.exists("PROVINCEALL");
        List<Area> Slist = null;
        if (isExists){
            String jsonData = jedisClient.get("PROVINCEALL");
            Slist = JsonUtils.jsonToList(jsonData,Area.class);
            System.out.println("此数据是从缓存库中获取" + jsonData);
        }else{
            Slist = areaService.selectSheng();
            //将数据转换为json，放入到redis数据库中
            String jsonData = JsonUtils.objectToJson(Slist);
            jedisClient.set("PROVINCEALL", jsonData);
            System.out.println("此数据是从数据库中获取" + jsonData);
        }


        return Slist;
    }
    @RequestMapping("/getCity")
    @ResponseBody
    public List<Area> getCity(int id){
        Boolean isExists = jedisClient.exists("CITY");
        if(isExists){
            String cityList = jedisClient.get("CITY");
        }
        List<Area> list = areaService.getCity(id);
        return list;
    }
    @RequestMapping("/getCountry")
    @ResponseBody
    public List<Area> getCountry(int id){
        List<Area> list = areaService.getCountry(id);
        return list;
    }

}
