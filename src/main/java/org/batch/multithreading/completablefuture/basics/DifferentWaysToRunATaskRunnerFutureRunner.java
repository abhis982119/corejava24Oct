package org.batch.multithreading.completablefuture.basics;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class DifferentWaysToRunATaskRunnerFutureRunner {


    public static void main(String[] args) {

        Runnable task =  () -> System.out.println(Thread.currentThread().getName()  +  " : sDaemon thread : "  + Thread.currentThread().isDaemon()  +  " : Hello, Dikhsita");

        new Thread(task).start();

        Executors.newFixedThreadPool(1).submit(task);

        CompletableFuture.runAsync(task);

    }
}
