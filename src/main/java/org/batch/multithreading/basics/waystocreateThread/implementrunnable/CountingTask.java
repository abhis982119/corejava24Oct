package org.batch.multithreading.basics.waystocreateThread.implementrunnable;

import lombok.SneakyThrows;
import org.batch.multithreading.basics.waystocreateThread.AbstractCountingProcessor;

public class CountingTask extends AbstractCountingProcessor implements  Runnable {
    @Override @SneakyThrows
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Hello, user : " + System.currentTimeMillis());
            Thread.sleep(2000);
        }
    }
}
