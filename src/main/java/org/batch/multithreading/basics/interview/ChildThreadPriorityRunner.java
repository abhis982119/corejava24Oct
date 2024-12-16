package org.batch.multithreading.basics.interview;

import org.batch.multithreading.basics.model.CountingTask;

public class ChildThreadPriorityRunner {


    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Thread name : " + mainThread.getName() + " , has priority : " + mainThread.getPriority());
        mainThread.setPriority(8);
        System.out.println("Thread name : " + mainThread.getName() + " , has priority : " + mainThread.getPriority());

        CountingTask countingTask = new CountingTask();
        Thread childThread = new Thread(countingTask);

        System.out.println("Thread name : " + childThread.getName() + " , has priority : " + childThread.getPriority());



        Thread childThread1 = new Thread(countingTask);

        System.out.println("Thread name : " + childThread1.getName() + " , has priority : " + childThread1.getPriority());

    }
}
