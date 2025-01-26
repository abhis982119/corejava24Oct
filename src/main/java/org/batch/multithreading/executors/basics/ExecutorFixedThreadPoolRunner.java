package org.batch.multithreading.executors.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFixedThreadPoolRunner {

    public static void main(String[] args) {
        Runnable greetHappyNewYearTask = () -> System.out.println(Thread.currentThread().getName() + " : Hello, User : Happy New Year" );

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i = 0; i < 5; i++){
            executorService.submit(greetHappyNewYearTask);
        }

    }
}
