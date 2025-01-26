package org.batch.multithreading.latchandbarrier.latch;

import lombok.SneakyThrows;

public class DistributorServiceUsingJoinRunner {

    @SneakyThrows
    public static void main(String[] args) {

        // pack chips
        //pack cola
        //pack biscuits

        // send the chips to the distributors


        Runnable packChipsTask = () -> System.out.println("Chips packed");
        Runnable packColaTask = () -> System.out.println("Cola packed");
        Runnable packBiscuitsTask = () -> System.out.println("Biscuits packed");

        Thread packChips = new Thread(packChipsTask);
        Thread packCola = new Thread(packColaTask);
        Thread packBiscuits = new Thread(packBiscuitsTask);

        packChips.start();
        packCola.start();
        packBiscuits.start();

        packChips.join();
        packCola.join();
        packBiscuits.join();

        System.out.println("Taking chips, cola and biscuits to distributor");


    }
}
