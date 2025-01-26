package org.batch.multithreading.threadbasicmethod.old.interview;

import lombok.SneakyThrows;

public class InteruptingThreadAtDifferntStatesRunner {


    static Integer lock = 1;

    @SneakyThrows
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " has come to get lock");
            synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() +  " : processing...  " );
                    try {
                        Thread.sleep(20000);
                    } catch (InterruptedException e) {
                        System.out.println( Thread.currentThread().getName() + " interrupted at : "+ ( System.currentTimeMillis() /1000 ));
                        throw new RuntimeException(e);
                    }
                }
        };

        Thread thread = new Thread(task);
        thread.start();

        Thread.sleep(1000);

        Thread waitingThread = new Thread(task);
        waitingThread.start();



        Thread.sleep(2000);
        System.out.println("Interrupting thread now...." + ( System.currentTimeMillis() /1000 )) ;
        waitingThread.interrupt();
    }
}
