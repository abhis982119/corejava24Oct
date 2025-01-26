package org.batch.multithreading.basics.threadlocalclasses;

import lombok.SneakyThrows;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        UberFareHelper uberFareHelper = new UberFareHelper();

        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All three threads will execute now"));


        Runnable getBaseFareTask = () -> {
            UberFareHelper.setMarkUp(1);
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
            uberFareHelper.getCabFare();
        };


        Runnable getTwiceBaseFare = () -> {
            UberFareHelper.setMarkUp(2);
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
            uberFareHelper.getCabFare();
        };


        Runnable getThriceBaseFare = () -> {
            UberFareHelper.setMarkUp(3);
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
            uberFareHelper.getCabFare();
        };


        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(getBaseFareTask);
        executorService.submit(getTwiceBaseFare);
        executorService.submit(getThriceBaseFare);


        Thread.sleep(3000);

        executorService.shutdown();


    }
}
