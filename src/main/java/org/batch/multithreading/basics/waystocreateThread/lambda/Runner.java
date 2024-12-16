package org.batch.multithreading.basics.waystocreateThread.lambda;

import lombok.SneakyThrows;
import org.batch.multithreading.basics.waystocreateThread.extendsthread.GreetingThread;
import org.batch.multithreading.basics.waystocreateThread.extendsthread.MyCountingThread;

public class Runner {

    public static void main(String[] args) {


        // print data to 1 to 5
        // MyCountingThread countingThread = new MyCountingThread();
        Runnable runnable  = () ->  {
                for (int i = 0; i < 5; i++) {
                    System.out.println( Thread.currentThread().getName() + " : " +  (i + 1));
                }
        };
        Thread countingThread = new Thread(runnable);
        countingThread.start();
    }
}
