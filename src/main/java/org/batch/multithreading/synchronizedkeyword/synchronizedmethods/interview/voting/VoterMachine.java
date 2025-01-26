package org.batch.multithreading.synchronizedkeyword.synchronizedmethods.interview.voting;

public class  VoterMachine {

    private int vote;  // currentValue : 1
    public synchronized void castVote(){
        int currentVote = vote; // thread-0  (0)
        vote = currentVote +1; // thread-0  (1)
        System.out.println("Casting vote by voter : " + Thread.currentThread().getName());
        //vote = vote+1;
    }


    public int getTotalVoteCasted(){
        return vote;
    }
}
