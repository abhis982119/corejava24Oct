package org.batch.multithreading.threadbasicmethod.old.yeildmethod;

import lombok.SneakyThrows;

public class YieldRunner {



    public static void main(String[] args) {

        Runnable countingTask = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " :  counting : " +  (i+1 ) ); //running
                Thread.yield();
            }
        };
        Thread countingThread = new Thread(countingTask);
        countingThread.start();
    }
}
