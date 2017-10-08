package com.weather.repositories;

import com.weather.reports.CurrentWeatherReport;
import com.weather.requests.WeatherRequest;

public class CurrentWeatherRepository extends Repository {
    public CurrentWeatherReport getCurrentWeather(WeatherRequest request) {
        this.readJsonFromUrl("https://api.openweathermap.org/data/2.5/find?q=" + request.getCityName() + "," + request.getCountryCode() + "&units=metric");
        return null;
    }
}
