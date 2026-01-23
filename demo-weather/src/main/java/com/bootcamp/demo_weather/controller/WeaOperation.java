package com.bootcamp.demo_weather.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo_weather.model.WeatherDTO;

public interface WeaOperation {


  @GetMapping(value = "/wea/fnd")
  List<WeatherDTO> getWeatherDTOs();

}
