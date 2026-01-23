package com.bootcamp.demo_weather.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo_weather.model.NineDayWeathers;
import com.bootcamp.demo_weather.model.WeatherDTO;
import com.bootcamp.demo_weather.service.JsonPlaceHolderService;

@Service
public class JsonPlaceHolderServiceImpl implements JsonPlaceHolderService {

  @Autowired
private RestTemplate restTemplate;

  @Override
  public List<WeatherDTO> getWeatherDTOs() {

    String url =
        "https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=fnd&lang=en";
    NineDayWeathers nineDayWeathers = this.restTemplate.getForObject(url, NineDayWeathers.class);

    return nineDayWeathers.getWeatherForecast();
  }

}
