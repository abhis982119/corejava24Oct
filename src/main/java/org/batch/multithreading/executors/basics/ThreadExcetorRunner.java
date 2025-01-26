package org.batch.multithreading.executors.basics;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExcetorRunner {


    public static void main(String[] args) {

        Runnable greetHappyNewYearTask = () -> System.out.println(Thread.currentThread().getName() + " : Hello, User : Happy New Year" );

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for(int i = 0; i < 5; i++){
            executorService.submit(greetHappyNewYearTask);
        }


    }
}
