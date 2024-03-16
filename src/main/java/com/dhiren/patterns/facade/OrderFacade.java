package com.dhiren.patterns.facade;

public class OrderFacade {

    OrderProcessor processor = new OrderProcessor();

    public void processOrder(String name, int quantity) {

        var inStock = processor.checkStock("MacBook" , 2);
        if(inStock) {
            var order = processor.placeOrder("MacBook", 2);
            processor.shipOrder(order);
        }
    }


}
