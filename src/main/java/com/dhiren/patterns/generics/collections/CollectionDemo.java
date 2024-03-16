package com.dhiren.patterns.generics.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dhiren");

        System.out.println(list);

        Box<Integer> items = new Box<>(List.of(1,2,3,4));
        System.out.println(items);

    }

}
