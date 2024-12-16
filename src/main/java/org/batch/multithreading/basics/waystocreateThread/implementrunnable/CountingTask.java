package org.batch.multithreading.basics.waystocreateThread.implementrunnable;

import lombok.SneakyThrows;
import org.batch.multithreading.basics.model.AbstractCountingProcessor;

public class CountingTask extends AbstractCountingProcessor implements  Runnable {
    @Override @SneakyThrows
    public void run() {

        for(int i = 0; i < 5; i++){
            System.out.println( Thread.currentThread().getName() + " : " + (i+1));
            Thread.sleep(2000);
        }
    }
}
