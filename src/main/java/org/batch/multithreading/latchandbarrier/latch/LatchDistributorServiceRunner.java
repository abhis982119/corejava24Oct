package org.batch.multithreading.latchandbarrier.latch;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LatchDistributorServiceRunner {

    @SneakyThrows
    public static void main(String[] args) {

        // pack chips
        //pack cola
        //pack biscuits

        // send the chips to the distributors

        CountDownLatch latch = new CountDownLatch(3);

        Runnable packChipsTask = () -> {
            System.out.println("Chips packed");
            latch.countDown(); // unlock a single latch
        };

        Runnable packColaTask = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Cola packed");
            latch.countDown(); // unlock a single latch
        };

        Runnable packBiscuitsTask = () -> {
            System.out.println("Biscuits packed");
            latch.countDown(); // unlock a single latch
        };


        List<Runnable> tasks = Arrays.asList(packChipsTask, packColaTask, packBiscuitsTask);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(Runnable task : tasks){
            executorService.submit(task);
        }

        System.out.println("Now will wait for all task to get completed.");
        latch.await(); // wait until all latches are open
        System.out.println("Taking chips, cola and biscuits to distributor");



        executorService.shutdown();


        /*

        task =    [1,2,3,4,5,6,7,8,9,10, ITask], 1 task can take 10 sec

         */

    }
}
