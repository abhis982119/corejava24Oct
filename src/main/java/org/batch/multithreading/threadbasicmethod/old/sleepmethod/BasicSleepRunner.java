package org.batch.multithreading.threadbasicmethod.old.sleepmethod;

import lombok.SneakyThrows;

public class BasicSleepRunner {

    @SneakyThrows
    public static void main(String[] args) {
        for(int i = 0; i < 5 ; i++ ){
            System.out.println("Hello, User : " + Thread.currentThread().getName());
            Thread.sleep(2000,20);
        }
    }
}
