package org.batch.multithreading.locks.basics.lockingandunlocking;



import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class BasicUserOfLockRunner {



    @SneakyThrows
    public static void main(String[] args) {

        VotingMachine voterMachine = new VotingMachine();
        for(int i = 0; i < 50; i++){
            CompletableFuture.runAsync(voterMachine::castVote);
        }

        Thread.sleep(20000000);

        System.out.println("total votes casted : " + voterMachine.getTotalVotes());
    }
}
