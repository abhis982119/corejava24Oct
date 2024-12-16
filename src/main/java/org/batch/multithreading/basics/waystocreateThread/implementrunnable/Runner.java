package org.batch.multithreading.basics.waystocreateThread.implementrunnable;

import org.batch.multithreading.basics.waystocreateThread.extendsthread.GreetingThread;

public class Runner {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " starts execution");
        CountingTask countingTask = new CountingTask();
        Thread countingTaskThread = new Thread(countingTask);
        countingTaskThread.start();

        System.out.println(Thread.currentThread().getName() + " ends execution");

    }

    /*

                       CPU
                   ---- ------



                ThreadScheduler  [ main, t0, t1, t2,t3, t4 ... tn  ]


       main()                       thread-4


     */
}
