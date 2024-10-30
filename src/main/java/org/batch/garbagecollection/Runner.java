package org.batch.garbagecollection;

import lombok.SneakyThrows;

public class Runner {


    @SneakyThrows
    public static void main(String[] args) {
        A a = new A();
        a = null;

        System.gc();


        Thread.sleep(3000);
        System.out.println("main()-ends");
    }
}
