package com.bootcamp.demo_weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDTO {

  @JsonProperty("forecastDate")
  private String forecastDate;

  @JsonProperty("week")
  private String week;

  @JsonProperty("forecastWind")
  private String forecastWind;

  @JsonProperty("forecastWeather")
  private String forecastWeather;

  @JsonProperty("forecastMaxtemp")
  private ForecastTemp forecastMaxTemp;

  @JsonProperty("forecastMintemp")
  private ForecastTemp forecastMinTemp;

  @JsonProperty("forecastMaxrh")
  private ForecastRh forecastMaxRh;

  @JsonProperty("forecastMinrh")
  private ForecastRh forecastMinRh;

  @JsonProperty("ForecastIcon")
  private Integer forecastIcon;

  @JsonProperty("PSR")
  private String psr;

  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class ForecastTemp {
    @JsonProperty("value")
    private Integer value;

    @JsonProperty("unit")
    private String unit;

    @Override
    public String toString() {
      return value + " " + unit;
    }
  }

  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class ForecastRh {
    @JsonProperty("value")
    private Integer value;

    @JsonProperty("unit")
    private String unit;

    @Override
    public String toString() {
      return value + " " + unit;
    }
  }



}