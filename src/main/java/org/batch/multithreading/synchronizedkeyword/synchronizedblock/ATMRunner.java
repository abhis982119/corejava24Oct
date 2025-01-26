package org.batch.multithreading.synchronizedkeyword.synchronizedblock;

public class ATMRunner {


    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();


        Runnable checkBalanceTask = () -> atm.checkBalance();

        for(int i = 0; i < 2; i++){
            new Thread(checkBalanceTask).start();
        }

    }
}
