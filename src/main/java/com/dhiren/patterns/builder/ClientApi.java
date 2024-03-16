package com.dhiren.patterns.builder;

public class ClientApi {

    public static void main(String[] args) {
        HttpClient client = new HttpClient.HttpClientBuilder()
                .httpMethod("GET")
                .url("https://www.google.com")
                .auth("X", "YZ")
                .build();

        System.out.println(client);

        HttpClient client1 = new HttpClient.HttpClientBuilder()
                .httpMethod("POST")
                .url("https://www.google.com")
                .auth("X", "YZ")
                .header("AUTH")
                .body("{}")
                .build();

        System.out.println(client1);
    }

}
