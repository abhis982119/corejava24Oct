package org.batch.multithreading.latchandbarrier.barrier;

import lombok.SneakyThrows;

import java.util.concurrent.*;

public class RacingEventRunner {

    @SneakyThrows
    public static void main(String[] args) {
        // replicate an olympic race event
        // all players should wait at starting point and start running as soon as gun is fired.

        System.out.println("Wating for the players to reach the starting point");
        Runnable startRaceTask = () -> System.out.println("Race started.");

        CyclicBarrier barrier = new CyclicBarrier(3,startRaceTask );

        Runnable player1 = getRunningTask(barrier);
        Runnable player2 = getRunning10SecDelayedTask(barrier);
        Runnable player3 = getRunning20SecDelayedTask(barrier);



        ExecutorService executorService =  Executors.newFixedThreadPool(3);
        executorService.submit(player1);
        executorService.submit(player2);
        executorService.submit(player3);


        executorService.shutdown();
    }

    private static Runnable getRunningTask(CyclicBarrier barrier) {
        return () -> {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " player has come and waiting at : " + (System.currentTimeMillis()/1000));
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " is running");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        };
    }

    private static Runnable getRunning10SecDelayedTask(CyclicBarrier barrier) {
        return () -> {
            try {
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName() + " player has come and waiting at : " + (System.currentTimeMillis()/1000));
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " is running");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        };
    }

    private static Runnable getRunning20SecDelayedTask(CyclicBarrier barrier) {
        return () -> {
            try {
                Thread.sleep(20000);
                System.out.println(Thread.currentThread().getName() + " player has come and waiting at : " + (System.currentTimeMillis()/1000));
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " is running");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        };
    }

}
