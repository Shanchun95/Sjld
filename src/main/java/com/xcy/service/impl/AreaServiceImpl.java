package com.xcy.service.impl;

import com.xcy.jopo.Area;
import com.xcy.mapper.AreaMapper;
import com.xcy.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaMapper mapper;
    @Override
    public List<Area> selectSheng() {
        List<Area> areaList = mapper.selectSheng();
        return areaList;
    }

    @Override
    public List<Area> getCity(int id) {
        List<Area> city = mapper.getCity(id);
        return city;

    }

    @Override
    public List<Area> getCountry(int id) {
        List<Area> country = mapper.getCountry(id);
        return country;
    }
}
