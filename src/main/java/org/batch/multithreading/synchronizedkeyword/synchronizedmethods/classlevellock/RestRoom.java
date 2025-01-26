package org.batch.multithreading.synchronizedkeyword.synchronizedmethods.classlevellock;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class RestRoom {

    private WashBasin washBasin;

    private HandDryer handDryer;



    @SneakyThrows
    public synchronized void userWashBasin(){
        System.out.println(Thread.currentThread().getName() + ": started using washbasin");
        Thread.sleep(4000);
        System.out.println(Thread.currentThread().getName() + ": ended using washbasin");
    }

    @SneakyThrows
    public static synchronized void useHandDryer(){
        System.out.println(Thread.currentThread().getName() + " started using handryer");
        Thread.sleep(4000);
        System.out.println(Thread.currentThread().getName() + " ended using handryer");
    }
}
