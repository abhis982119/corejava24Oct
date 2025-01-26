package org.batch.multithreading.locks.basics.interruptwhilewaiting;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {


    private final Lock lock = new ReentrantLock();

    @SneakyThrows
    public void getResouce(){
        System.out.println(Thread.currentThread().getName() + " : here to get resouce  " +   (System.currentTimeMillis()/100000) );
        lock.lockInterruptibly();
        System.out.println(Thread.currentThread().getName() + " : processing   "+ (System.currentTimeMillis()/100000) );
        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println(Thread.currentThread().getName() + " : interrupted at    "+ (System.currentTimeMillis()/100000) );
        }
        lock.unlock();
    }

}
