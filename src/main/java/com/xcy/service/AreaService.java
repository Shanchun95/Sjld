package com.xcy.service;

import com.xcy.jopo.Area;

import java.util.List;

public interface AreaService  {

    List<Area>  selectSheng();


    List<Area> getCity(int id);

    List<Area> getCountry(int id);
}
