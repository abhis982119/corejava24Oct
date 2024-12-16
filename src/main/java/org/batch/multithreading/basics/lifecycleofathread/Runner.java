package org.batch.multithreading.basics.lifecycleofathread;

public class Runner {

    /*
    1) New
    2) Ready
    3) Running state
    4) Blocked / waiting / non-running mode
    5) Dead state
     */
    public static void main(String[] args) {
        MyThread thread = new MyThread(); // New
        thread.start();  // Ready
    }
}
