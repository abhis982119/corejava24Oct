package org.batch.multithreading.executors.callablepackage.basics.pacakgepricecalcutor;

import lombok.SneakyThrows;

public class BasicPackageCalculatorRunner {


    public static void main(String[] args) {
        /*
        package : flight     : getFlightPrice
                  hotel      : getHotelPrice
                  activites  : getActivityPrice

                 total package price : x+y+z
         */

        long startTime = System.currentTimeMillis();
        int flightPrice = getFlightPrice();
        int hotelPrice = getHotelPrice();
        int activityPrice = getActivityPrice();

        long endTime = System.currentTimeMillis();
        long totalTimeTaken =  ( endTime - startTime )/1000;


        System.out.println("Total time taken in seconds  : " + totalTimeTaken);
        System.out.println("total package price : " + (flightPrice + hotelPrice + activityPrice));

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
