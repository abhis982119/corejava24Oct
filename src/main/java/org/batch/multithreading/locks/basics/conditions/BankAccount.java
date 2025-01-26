package org.batch.multithreading.locks.basics.conditions;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {


    private final Lock lock = new ReentrantLock();

    private final Condition sufficientFunds = lock.newCondition();


    private double balance;


    public void deposit(double amountToCredit) {
        lock.lock();
        balance += amountToCredit;
        System.out.println("Amount to credit :  " + amountToCredit + ", new total balance : " + balance);
        sufficientFunds.signal();
        lock.unlock();
    }


    @SneakyThrows
    public void autoDebit(double amountToDebit) {
        lock.lock();

        while(balance < amountToDebit){
            System.out.println("Not sufficient amount to debit : current balance  " + balance + ", amountToDebit : " + amountToDebit);
            sufficientFunds.await();
        }

        balance -= amountToDebit;
        System.out.println("Amount to debit :  " + amountToDebit + ", new total balance : " + balance);

        lock.unlock();
    }


}
