package org.batch.multithreading.executors.callablepackage.basics.callableandfuture;

import lombok.SneakyThrows;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {


    @SneakyThrows
    public static void main(String[] args) {

        Runnable task  = () ->  System.out.println();

        Callable<Integer> getFlightPriceTask = () ->{
            System.out.println("Hit the api of flight-service");
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName() + " : Hi, calculating the price of flight");
            return 20;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> flightPrice = executorService.submit(getFlightPriceTask);

        System.out.println("FlightPrice : " + flightPrice.get());
        System.out.println(Thread.currentThread().getName() + "  ends ");
    }
}
