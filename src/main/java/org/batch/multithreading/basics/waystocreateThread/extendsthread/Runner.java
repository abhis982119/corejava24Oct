package org.batch.multithreading.basics.waystocreateThread.extendsthread;

import java.util.Date;
import java.util.concurrent.CompletableFuture;

public class Runner {


    public static void main(String[] args) {
        // print data to 1 to 5
        MyCountingThread countingThread = new MyCountingThread();
        countingThread.start();


        // print Hello,user
        GreetingThread greetingThread = new GreetingThread();
        greetingThread.start();

    }
}
