package org.batch.multithreading.locks.basics.waitnsecforlock;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {

    private Lock lock = new ReentrantLock(true);


    @SneakyThrows
    public void getAccess(){
        System.out.println(Thread.currentThread().getName() + " : came to get access of the resource");
        if(lock.tryLock(21, TimeUnit.SECONDS)) {
            System.out.println(Thread.currentThread().getName() + " : get lock and start processing");
            Thread.sleep(10000);
            lock.unlock();
        }else {
            System.out.println(Thread.currentThread().getName() + " : unable to get lock hence not processing the task ");
        }
    }
}
