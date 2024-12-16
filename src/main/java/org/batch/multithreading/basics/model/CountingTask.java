package org.batch.multithreading.basics.model;

import lombok.SneakyThrows;

public class CountingTask implements  Runnable{
    @Override @SneakyThrows
    public void run() {
        //count from 1 to 10
        for(int i = 0; i < 5; i++){
            System.out.println(i+1);
            Thread.sleep(2000);
        }
    }
}
