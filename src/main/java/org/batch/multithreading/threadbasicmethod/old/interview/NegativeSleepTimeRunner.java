package org.batch.multithreading.threadbasicmethod.old.interview;

import lombok.SneakyThrows;

public class NegativeSleepTimeRunner {

    @SneakyThrows
    public static void main(String[] args) {

        System.out.println(" Code started by : " + Thread.currentThread().getName());
        Thread.sleep(-2000);
        System.out.println(" Code ended by : " + Thread.currentThread().getName());
    }
}
