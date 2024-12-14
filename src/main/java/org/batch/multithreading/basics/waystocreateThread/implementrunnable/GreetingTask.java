package org.batch.multithreading.basics.waystocreateThread.implementrunnable;

import lombok.SneakyThrows;

public class GreetingTask implements Runnable {
    @Override @SneakyThrows
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(i+1);
            Thread.sleep(2000);
        }
    }
}
