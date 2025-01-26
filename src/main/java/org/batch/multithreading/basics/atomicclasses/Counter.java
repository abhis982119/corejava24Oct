package org.batch.multithreading.basics.atomicclasses;

public class Counter {


    private int count;

    public void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
