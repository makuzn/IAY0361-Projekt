package com.weather.reports;

abstract public class Report {
    protected String cityName;
    protected String countryCode;
    protected String units;

    protected Double currentTemperature;
    protected Double minimalTemperature;
    protected Double maximumTemperature;

    public String getCityName() {
        return cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getUnits() {
        return units;
    }

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public Double getMinimalTemperature() {
        return minimalTemperature;
    }

    public Double getMaximumTemperature() {
        return maximumTemperature;
    }
}
