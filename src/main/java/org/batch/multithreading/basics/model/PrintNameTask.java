package org.batch.multithreading.basics.model;

import lombok.SneakyThrows;

public class PrintNameTask implements  Runnable{


    @Override @SneakyThrows
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Hello, User");
            Thread.sleep(2000);
        }
    }
}
