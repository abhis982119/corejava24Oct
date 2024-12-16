package org.batch.multithreading.basics.interview;

import org.batch.multithreading.basics.model.CountingTask;

public class RegisteringTheThreadTwice {


    public static void main(String[] args) {
        CountingTask task = new CountingTask();
        Thread thread = new Thread(task);
        thread.start();  //register the thread to thread scheduler
        thread.start();  //register the thread same thread again //java.lang.IllegalThreadStateException
    }
}
