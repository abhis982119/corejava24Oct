package org.batch.multithreading.synchronizedkeyword.synchronizedmethods.interview.voting;

import lombok.SneakyThrows;

public class ElectionCommisionRunner {

    @SneakyThrows
    public static void main(String[] args) {

        VoterMachine voterMachine = new VoterMachine();  //shared object between threads

        Runnable casteNVotesTask = () -> {
            for (int i = 0; i < 10000; i++) {
                new Thread(() -> voterMachine.castVote()).start();
            }
        };


        for(int i = 0; i < 40; i++) {
            new Thread(casteNVotesTask).start();
        }



        Thread.sleep(15000);
        System.out.println("Total votes casted : " + voterMachine.getTotalVoteCasted());
    }
}
