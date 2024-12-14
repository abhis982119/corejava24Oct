package org.batch.multithreading.basics.waystocreateThread.extendsthread;

import lombok.SneakyThrows;
import org.batch.multithreading.basics.waystocreateThread.AbstractCountingProcessor;

public class MyCountingThread extends Thread {

    @Override @SneakyThrows
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(i+1);
            Thread.sleep(2000);
        }
    }
}
