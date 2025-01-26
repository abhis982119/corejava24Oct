package org.batch.multithreading.locks.basics.waitnsecforlock;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        Resource resource = new Resource();

        for(int i = 0; i < 4; i++){
            CompletableFuture.runAsync(resource::getAccess);
        }

        Thread.sleep(100000);
    }
}
