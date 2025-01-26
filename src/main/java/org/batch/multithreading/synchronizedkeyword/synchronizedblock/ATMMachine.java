package org.batch.multithreading.synchronizedkeyword.synchronizedblock;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATMMachine {

    private Integer lock =  Integer.parseInt("10");

    public String depositMoney(int amountToDesposit){
        return amountToDesposit + " :  amount deposited";
    }

    @SneakyThrows
    public void checkBalance(){

        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " checking balance ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " : account balance is : " + (Math.random() * 100));
        }
    }


}

