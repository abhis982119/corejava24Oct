package org.batch.multithreading.locks.basics.conditions;

import lombok.SneakyThrows;
import org.batch.specialkeywords.superkeyword.constuctor.B;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        new Thread(() -> account.autoDebit(90)).start();

        Thread.sleep(2000);
        new Thread(() -> account.deposit(40)).start();

        Thread.sleep(5000);
        new Thread(() -> account.deposit(60)).start();

    }
}
