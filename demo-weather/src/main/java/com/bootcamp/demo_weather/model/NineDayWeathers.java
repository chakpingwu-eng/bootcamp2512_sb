package com.bootcamp.demo_weather.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NineDayWeathers {
  private String generalSituation;
  private List<WeatherDTO> weatherForecast;
}
