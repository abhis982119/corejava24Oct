package org.batch.multithreading.basics.knowledgebits;

import java.util.concurrent.locks.Lock;

public class ThreadPriority {

    public static void main(String[] args) {

        Thread mainThread =  Thread.currentThread();

        System.out.println("Thread name : " + mainThread.getName()
            + " has priority : " + mainThread.getPriority());

        System.out.println("Max Thread priority : " + Thread.MAX_PRIORITY);
        System.out.println("Min Thread priority : " + Thread.MIN_PRIORITY);
        System.out.println("Norm Thread priority : " + Thread.NORM_PRIORITY);
    }
}
