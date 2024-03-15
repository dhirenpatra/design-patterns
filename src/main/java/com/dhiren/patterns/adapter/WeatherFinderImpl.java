package com.dhiren.patterns.adapter;

public class WeatherFinderImpl implements WealthFinder {
    @Override
    public int findWeather(String city) {
        System.out.println("Finding Temperature for the city "+city);
        return 37;
    }
}
