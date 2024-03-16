package com.dhiren.patterns.iterator;

public class Driver {

    public static void main(String[] args) {

        Product productOne = new Product("Iphone 15 Pro");
        Product productTwo = new Product("IPad Pro 9th Gen");
        Product productThree = new Product("Apple Watch");

        ProductGroup group = new ProductGroup();
        group.add(productOne);
        group.add(productTwo);
        group.add(productThree);

        Product[] products = group.getProducts();
        var iterator = group.iterator();
        for(Product product : products) {
            if(iterator.hasNext())
                System.out.println(iterator.next());
        }

    }

}