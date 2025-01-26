package org.batch.multithreading.locks.basics.lockingandunlocking;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VotingMachine {

    private int totalVotes ;

    private final Lock lock = new ReentrantLock();

    @SneakyThrows
    public void castVote(){
        System.out.println(Thread.currentThread().getName() + " reach to caste vote at : "  + (System.currentTimeMillis()/1000));
        lock.lock();  //t1  -> t2

        castVote();

        System.out.println(Thread.currentThread().getName() + " has lock and will caste vote at : "  + (System.currentTimeMillis()/1000));
        Thread.sleep(5000);
        totalVotes++;
    }


    public void m2(){

        System.out.println("line-1");
        System.out.println("line-2");
        System.out.println("line-3");
        System.out.println("line-4");
        System.out.println("line-5");
        lock.unlock();
        System.out.println("line-6");
        System.out.println("line-7");
        System.out.println("line-8");
    }






    public int getTotalVotes() {
        return totalVotes;
    }
}
