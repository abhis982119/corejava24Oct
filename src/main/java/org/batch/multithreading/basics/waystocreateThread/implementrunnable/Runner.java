package org.batch.multithreading.basics.waystocreateThread.implementrunnable;

import org.batch.multithreading.basics.waystocreateThread.extendsthread.GreetingThread;

public class Runner {

    public static void main(String[] args) {

        CountingTask countingTask = new CountingTask();
        Thread countingTaskThread = new Thread(countingTask);
        countingTaskThread.start();
        countingTask.m1();

        GreetingTask greetingTask = new GreetingTask();
        Thread greetTaskThread = new Thread(greetingTask);
        greetTaskThread.start();
    }
}
