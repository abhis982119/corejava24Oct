package org.batch.multithreading.basics.lifecycleofathread;

import lombok.SneakyThrows;

public class MyThread extends  Thread{

    @Override @SneakyThrows
    public void run() {
        for(int i = 0; i < 5; i++){    // Running
            System.out.println(i+1);
            Thread.sleep(2000);  // Waiting/sleeping
        }
    } //Dead
}
