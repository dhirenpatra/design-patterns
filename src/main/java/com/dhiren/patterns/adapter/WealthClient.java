package com.dhiren.patterns.adapter;

public class WealthClient {

    public void showTemperature (int zipcode) {
        WealthAdapter adapter = new WealthAdapter();
        System.out.println(adapter.getTemperature(zipcode));
    }

}
