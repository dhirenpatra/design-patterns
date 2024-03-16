package com.dhiren.patterns.generics.bounded;

import java.util.List;

public class AgeSorter<T extends Number> {

    private List<T> ages;

    public AgeSorter(List<T> ages) {
        this.ages = ages;
    }

    public List<T> getAges() {
        return ages;
    }

    public void getSortedData() {
        ages.stream().sorted().forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "AgeSorter{" +
                "ages=" + ages +
                '}';
    }
}
