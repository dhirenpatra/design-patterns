package com.dhiren.patterns.generics.collections;

import java.util.List;

public class Box<T> {

    private List<T> items;

    public Box(List<T> items) {
        this.items = items;
    }

    public List<T> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}
