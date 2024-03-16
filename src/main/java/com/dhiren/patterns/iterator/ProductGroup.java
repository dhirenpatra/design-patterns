package com.dhiren.patterns.iterator;

public class ProductGroup implements Group {

    private final Product[] products = new Product[10];



    int counter = 0;

    public void add(Product product) {
        products[counter] = product;
        counter++;
    }
    @Override
    public CustomIterator iterator() {
        return new ProductIterator(products);
    }

    public Product[] getProducts() {
        return products;
    }
}
