package org.batch.multithreading.waitandnotify.basics;

import lombok.SneakyThrows;

public class BusManager extends Object {

    private boolean fullCapacity = false;

    @SneakyThrows
    public synchronized void runBus() {
       if(!fullCapacity) {
           System.out.println(" Driver waiting for acknowledgement of full capacity");
           wait(2000); // wait until someone notify
       }


        System.out.println("Bus moving towards the destination");
    }



    @SneakyThrows
    public synchronized void conductorAcknowgingFullCapacity() {
        System.out.println("Condutor started added travellers ");
        for (int i = 0; i < 10; ) {
            System.out.println("Added traveller : " + i++);
            Thread.sleep(500);
        }
        if(true) return;

        fullCapacity = true;
        System.out.println("Now notifying driver to run the bus");
        Thread.sleep(2000);
        notify();
    }


}
