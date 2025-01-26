package org.batch.multithreading.completablefuture.functionalintroduction;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DifferentWorkerRunner {

    @SneakyThrows

    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Greeting from  :  " + Thread.currentThread().getName());


        CompletableFuture.runAsync(task);
        CompletableFuture.runAsync(task);
        CompletableFuture.runAsync(task);
        CompletableFuture.runAsync(task);
        CompletableFuture.runAsync(task);

        Thread.sleep(5000);

    }
}
