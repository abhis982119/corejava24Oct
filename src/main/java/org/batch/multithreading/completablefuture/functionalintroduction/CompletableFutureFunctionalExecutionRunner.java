package org.batch.multithreading.completablefuture.functionalintroduction;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureFunctionalExecutionRunner {


    @SneakyThrows
    public static void main(String[] args) {

        //use join for making it non-blocking, current Thread will stop there until result come from future
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hola, Users");
        System.out.println(future.join());


        double markUpPercent = 0.10;
/*        CompletableFuture<Integer> flightPriceWithMarkup = CompletableFuture.supplyAsync( () -> getAirAsiaFlightRate());
        int flightPriceResponse = flightPriceWithMarkup.get();
        System.out.println(flightPriceResponse + (flightPriceResponse*markUpPercent));*/


        CompletableFuture<Double> flightPriceWithMarkupFunctional = CompletableFuture.supplyAsync(() -> getAirAsiaFlightRate())
                .thenApply(flightPrice -> flightPrice + (flightPrice*markUpPercent));

        System.out.println("After processing flightrate");

        System.out.println(flightPriceWithMarkupFunctional.join());


        Runnable procurementTask =  () -> System.out.println("Create and pack the chips");
        Runnable distributionTask = () -> System.out.println("Started distribution of the chips");


        CompletableFuture.runAsync(procurementTask).thenRun(distributionTask);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CompletableFuture.runAsync(procurementTask, executorService);

        executorService.shutdown();
    }


    @SneakyThrows
    public static int getAirAsiaFlightRate(){
        Thread.sleep(1000);
        return 50;
    }
}
