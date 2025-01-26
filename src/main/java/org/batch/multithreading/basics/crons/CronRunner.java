package org.batch.multithreading.basics.crons;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CronRunner {

    private static int counter = 0;

    public static void main(String[] args) {

        List<String> users = Arrays.asList("Dikshita", "Vinod" , "Kishore");

        Runnable greetAllUsers = () ->{
            System.out.println("Started greeting at : " +  (System.currentTimeMillis()  /1000) + "  for nth time : " + ++counter) ;
          for(String userName : users){
              System.out.println("Good Morning, " + userName);
          }
            System.out.println("Completed greeting at : " +  (System.currentTimeMillis()  /1000)) ;

        };


        ScheduledExecutorService executorService =  Executors.newScheduledThreadPool(1);

    //    executorService.submit(greetAllUsers);

        executorService.scheduleWithFixedDelay(greetAllUsers,0,60, TimeUnit.SECONDS );
    }
}
