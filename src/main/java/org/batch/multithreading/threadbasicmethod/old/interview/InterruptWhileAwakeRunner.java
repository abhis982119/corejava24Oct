package org.batch.multithreading.threadbasicmethod.old.interview;

import lombok.SneakyThrows;

public class InterruptWhileAwakeRunner {


    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("Code started by : " + Thread.currentThread().getName());


        Runnable countingTask = () -> {
            for(int i = 0; i < 1000; ){
                System.out.println("ThreadName :  " + Thread.currentThread().getName() + " : " +  ++i);
            }
        };
        Thread countingThread = new Thread(countingTask);
        countingThread.setName("countingThread");
        countingThread.start();

        Thread.sleep(10);
        countingThread.interrupt();  // nothing will happen as, thread is already awake

        System.out.println("Code ended by : " + Thread.currentThread().getName());
    }
}
