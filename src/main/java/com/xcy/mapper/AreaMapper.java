package com.xcy.mapper;

import com.xcy.jopo.Area;

import java.util.List;

public interface AreaMapper {

    List<Area> selectSheng();

    List<Area> getCity(int id);

    List<Area> getCountry(int id);
}
