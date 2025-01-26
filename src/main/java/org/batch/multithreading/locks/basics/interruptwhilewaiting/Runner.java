package org.batch.multithreading.locks.basics.interruptwhilewaiting;

import lombok.SneakyThrows;

public class Runner {


    @SneakyThrows
    public static void main(String[] args) {
        Resource resource = new Resource();

        Runnable task = resource::getResouce;

        Thread thread = new Thread(task);
        thread.start();

        Thread.sleep(1000);

        Thread waitingThread = new Thread(task);
        waitingThread.start();


        Thread.sleep(1000);
        System.out.println("Wating thread interrupted at " + (System.currentTimeMillis()/100000));
        waitingThread.interrupt();


    }
}
