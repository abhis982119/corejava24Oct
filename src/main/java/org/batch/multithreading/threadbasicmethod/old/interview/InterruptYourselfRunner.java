package org.batch.multithreading.threadbasicmethod.old.interview;

public class InterruptYourselfRunner {

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        System.out.println("Code started by  : " + mainThread.getName());


        mainThread.interrupt();

        System.out.println("Code ended by : " + mainThread.getName());
    }
}
