package org.batch.multithreading.basics.waystocreateThread.lambda;

public class LambdaOptimizer {


    public static void main(String[] args) {

        Thread helloThread = new Thread(() -> System.out.println("Hello from thread : " + Thread.currentThread().getName()));
        helloThread.setName("HelloThread");
        helloThread.start();
    }
}
