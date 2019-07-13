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
            System.out.println("此数据是从数据库中获取; provinceall:" + jsonData);
        }


        return Slist;
    }
    @RequestMapping("/getCity")
    @ResponseBody
    public List<Area> getCity(int id){
        Boolean isExists = jedisClient.exists("CITY"+id);
        List<Area> Xlist = null;
        if(isExists){
            String jsonData02 = jedisClient.get("CITY"+id);
            JsonUtils.jsonToList(jsonData02,Area.class);
            System.out.println("从缓存中获取："+ jsonData02);
        }else{
            Xlist = areaService.getCity(id);
            //将数据转换成json数据，并放入redis数据库中
            String jsonData02 = JsonUtils.objectToJson(Xlist);
            jedisClient.set("CITY"+id,jsonData02);
            System.out.println("从MySQL数据库中获取数据; city:" + jsonData02);
        }

        return Xlist;
    }
    @RequestMapping("/getCountry")
    @ResponseBody
    public List<Area> getCountry(int id){
        Boolean isExists = jedisClient.exists("COUNTRY"+id);
        List<Area> QList = null;
        if (isExists){
            String jsonData03 = jedisClient.get("COUNTRY"+id);
            QList = JsonUtils.jsonToList(jsonData03,Area.class);
            System.out.println("从redis数据库中获取； Country:" + jsonData03);
        }else{
            QList = areaService.getCountry(id);
            String jsonData03 = JsonUtils.objectToJson(QList);
            jedisClient.set("COUNTRY"+id,jsonData03);
            System.out.println("从MySQL数据库中获取; Country:" + jsonData03);
        }

        return QList;
    }

}
