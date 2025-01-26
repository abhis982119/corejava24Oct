package org.batch.multithreading.executors.interviewquestions;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskThrowErrorRunner {


    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Greeting task ");
        Callable<Integer> callableTask = () -> {
            System.out.println("Callable task");
            try {
                int a = 10 / 0; //arithemetic-exception // not to be logged or displayed in the termaill
            }catch (Exception e){
                System.out.println("Exception arised + " +  e.getMessage());
            }
            return 1;
        };
       ExecutorService executorService =  Executors.newFixedThreadPool(1);
       executorService.submit(task);
       executorService.submit(callableTask);
       executorService.submit(task);







       executorService.shutdown();
    }
}
