package org.batch.multithreading.executors.callablepackage.basics.pacakgepricecalcutor;

import lombok.SneakyThrows;
import org.batch.garbagecollection.A;

import java.lang.reflect.AnnotatedArrayType;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class OptimizedPackagePriceCalculator {

    static  AtomicInteger a = new AtomicInteger();

    @SneakyThrows
    public static void main(String[] args) {

        /*
        package : flight     : getFlightPrice
                  hotel      : getHotelPrice
                  activites  : getActivityPrice

                 total package price : x+y+z
         */

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        long startTime = System.currentTimeMillis();


        Callable<Integer> getFlightPriceTask = () -> {
            System.out.println(Thread.currentThread().getName() + " : Hitting flight api for price ");
            return getFlightPrice();
        };

        Callable<Integer> getHotelPriceTask = () -> {
            System.out.println(Thread.currentThread().getName() + " : Hitting hotel api for price ");
            return getHotelPrice();
        };

        Callable<Integer> getActivityPriceTask = () -> {
            System.out.println(Thread.currentThread().getName() + " : Hitting acitivty api for price ");
            return getActivityPrice();
        };

        Future<Integer> flightPrice = executorService.submit(getFlightPriceTask);
        Future<Integer> hotelPrice = executorService.submit(getHotelPriceTask);
        Future<Integer> activityPrice = executorService.submit(getActivityPriceTask);

        int totalPackagePrice = flightPrice.get() + hotelPrice.get() + activityPrice.get();

        long endTime = System.currentTimeMillis();
        long totalTimeTaken =  ( endTime - startTime )/1000;


        System.out.println("Total time taken in seconds  : " + totalTimeTaken);
        System.out.println("Total package price : " + totalPackagePrice);

    }


    @SneakyThrows
    public static int getFlightPrice(){
        Thread.sleep(4000);
        return 100;
    }

    @SneakyThrows
    public static int getHotelPrice(){
        Thread.sleep(6000);
        return 200;
    }

    @SneakyThrows
    public static int getActivityPrice(){
        Thread.sleep(30);
        return 400;
    }

}
