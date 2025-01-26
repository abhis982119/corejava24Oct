package org.batch.multithreading.basics.daemonthread;

import lombok.SneakyThrows;

import java.sql.SQLOutput;

public class DaemonThreadRunner {


    @SneakyThrows
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println("ThreadName : " + mainThread.getName() + " is daemon thread : " + mainThread.isDaemon());


        Thread turtleInMario = new Thread(() -> {
            while(true){

                System.out.println("daemon (background-thread) thread running, so jvm will not shutdown");

                Thread childThreadOfDeamon = new Thread(()-> System.out.println("child thread of daemon thread"));

                System.out.println("childThreadOfDeamon is daemon : " + childThreadOfDeamon.isDaemon());

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        turtleInMario.setDaemon(true);
        turtleInMario.start();


        Thread.sleep(10000);

        System.out.println("Main thread ends");

    }
}
