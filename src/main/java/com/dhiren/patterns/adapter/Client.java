package com.dhiren.patterns.adapter;

public class Client {

    public static void main(String[] args) {
        WealthClient client = new WealthClient();
        client.showTemperature(560037);
        client.showTemperature(100003);
    }

}
