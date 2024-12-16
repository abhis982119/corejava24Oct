package org.batch.multithreading.basics.knowledgebits;

public class MainMethodThreadNameAndThreadGroupRunner {


    public static void main(String[] args) {
        System.out.println("Thread group details : " + Thread.currentThread().getThreadGroup());;
        System.out.println("Thead name : " + Thread.currentThread().getName());

    }
}
