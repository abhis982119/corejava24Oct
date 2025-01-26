package org.batch.multithreading.waitandnotify.basics;

public class Runner {


    public static void main(String[] args) {


        //thread :1 and Thread:2
        BusManager busManager = new BusManager();


        Runnable runBusTask = () -> busManager.runBus();
        Runnable conductorAckTask = () -> busManager.conductorAcknowgingFullCapacity();


        new Thread(runBusTask).start();
        new Thread(conductorAckTask).start();


    }
}
