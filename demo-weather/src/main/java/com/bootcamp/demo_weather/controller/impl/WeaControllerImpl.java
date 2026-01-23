package com.bootcamp.demo_weather.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo_weather.controller.WeaOperation;
import com.bootcamp.demo_weather.model.WeatherDTO;
import com.bootcamp.demo_weather.service.JsonPlaceHolderService;

@RestController
public class WeaControllerImpl implements WeaOperation {

  @Autowired
  private JsonPlaceHolderService jsonPlaceHolderService;


  @Override
  public List<WeatherDTO> getWeatherDTOs() {

    return this.jsonPlaceHolderService.getWeatherDTOs();

  }
}
