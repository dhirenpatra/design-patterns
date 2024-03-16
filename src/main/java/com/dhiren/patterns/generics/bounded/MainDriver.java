package com.dhiren.patterns.generics.bounded;

import java.util.List;

public class MainDriver {

    public static void main(String[] args) {
        var list = List.of(1,4,5,2,3);
        AgeSorter<Integer> sorter = new AgeSorter<>(list);
        sorter.getSortedData();
    }

}
