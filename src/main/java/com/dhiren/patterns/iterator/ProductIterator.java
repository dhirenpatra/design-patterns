package com.dhiren.patterns.iterator;

public class ProductIterator implements CustomIterator {

    private Product[] products;
    private int currentPosition = 0;

    public ProductIterator(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return products[currentPosition] != null;
    }

    @Override
    public Object next() {
        return products[currentPosition++];
    }
}
