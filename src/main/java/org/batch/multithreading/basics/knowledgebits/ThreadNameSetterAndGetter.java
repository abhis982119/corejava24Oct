package org.batch.multithreading.basics.knowledgebits;

public class ThreadNameSetterAndGetter {


    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println("Thread name : " + mainThread.getName());

        mainThread.setName("kishore_thread");

        System.out.println("Thread name : " + mainThread.getName());



    }
}
