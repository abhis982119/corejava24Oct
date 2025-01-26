package org.batch.multithreading.basics.volatilekeyword;

import lombok.SneakyThrows;

public class VolatileExample {

    private volatile static boolean work = true;


    @SneakyThrows
    public static void main(String[] args) {

        Runnable infiniteGreetings = () -> {

            while(work){
                System.out.println( Thread.currentThread().getName() + " : working.... at " +  ( System.currentTimeMillis() ));
            }
        };

        new Thread(infiniteGreetings).start();


        Thread.sleep(20);

        new Thread( () -> {
            System.out.println("");
            work = false;
            System.out.println("sending stop signal at  : " +  ( System.currentTimeMillis() )) ;
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Ending stopper thread");
        }).start();


        Thread.sleep(40000);
        System.out.println("Ending the main thread.");

    }

}
