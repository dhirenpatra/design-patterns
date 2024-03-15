package com.dhiren.patterns.adapter;

public class WealthAdapter {

    public int getTemperature(int zipcode) {
        String city;
        if(zipcode == 560037) {
            city = "Bengaluru";
        } else
            city = "Delhi";
        return new WeatherFinderImpl().findWeather(city);
    }

}
