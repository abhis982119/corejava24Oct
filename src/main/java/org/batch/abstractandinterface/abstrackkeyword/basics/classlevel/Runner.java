package org.batch.abstractandinterface.abstrackkeyword.basics.classlevel;

public class Runner {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder();
    }
}
