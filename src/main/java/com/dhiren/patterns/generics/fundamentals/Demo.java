package com.dhiren.patterns.generics.fundamentals;

public class Demo {

    public static void main(String[] args) {
        Data<String> dataString = new Data<>("This is some data");
        System.out.println(dataString);

        Data<Integer> dataInt = new Data<>(20);
        System.out.println(dataInt);

        Data<Double> dataDouble = new Data<>(20.0);
        System.out.println(dataDouble);

        IData<String> d3 = new Data<>("Interface Data");
        IData<Integer> d4 = new Data<>(20);

        System.out.println(d3);
        System.out.println(d4);
    }
}
