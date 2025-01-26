package org.batch.multithreading.waitandnotify.pc;

import lombok.SneakyThrows;

public class PC {

    private int maxCapacity = 5;
    private int laysProduced = 0;


    @SneakyThrows
    public void produce() {

        while (true) {

            synchronized (this) {
            if (laysProduced == maxCapacity) {
                System.out.println( Thread.currentThread().getName() + " : production has reached to maxCapacity stopping production");
                wait();
            }
            

                System.out.println(Thread.currentThread().getName() + " :  As,the warehouse is empty, production is starting..");
                Thread.sleep(2000);


                for (int i = 0; i < maxCapacity; i++) {
                    System.out.println(Thread.currentThread().getName() + " Lays number produced : " + ++laysProduced);
                    Thread.sleep(1000);
                }

                System.out.println(Thread.currentThread().getName() +  " : The entire warehouse is full, calling the consumer to consume");
                Thread.sleep(2000);
                notify();
            }
        }

    }


    @SneakyThrows

    public void consume() {

        while(true) {
            synchronized (this) {
                if (laysProduced < maxCapacity) {
                    System.out.println(Thread.currentThread().getName() + " : The warehouse is not full, so waiting for production to fill the warehouse");
                    wait();
                }


                for (int i = 0; i < maxCapacity; i++) {
                    System.out.println(Thread.currentThread().getName() +  " : Consuming the packed number : " + laysProduced--);
                    Thread.sleep(2000);
                }

                System.out.println(Thread.currentThread().getName() +  " : The entireWarehouse is consumed, notifying producer to start producing");
                Thread.sleep(2000);
                notify();
            }
        }

    }


}
