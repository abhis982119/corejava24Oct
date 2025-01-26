package org.batch.multithreading.basics.atomicclasses;

import lombok.SneakyThrows;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {

       // Counter counter = new Counter();
        AtomicCounter counter = new AtomicCounter();

        Runnable task = () -> counter.increment();

        for(int i = 0; i < 1000; i++){
            new Thread(task).start();
        }

        Thread.sleep(2000);
        System.out.println("Counter :  " + counter.getCount());
    }
}
