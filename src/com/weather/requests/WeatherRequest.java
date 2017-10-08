package com.weather.requests;

public class WeatherRequest {
    protected String cityName;
    protected String countryName;
    protected String units;

    public WeatherRequest(String cityName, String countryName, String units) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.units = units;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
