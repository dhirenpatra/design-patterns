package com.dhiren.patterns.generics.method;

import java.util.List;

public class GenericMethod {

    public static void main(String[] args) {
        System.out.println(concat("Dhiren"));
        System.out.println(concat(101));
    }

    public static <T> String concat(T s) {
        return "Data Is "+s;
    }

}
