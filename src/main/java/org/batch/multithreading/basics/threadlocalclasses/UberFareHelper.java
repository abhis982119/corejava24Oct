package org.batch.multithreading.basics.threadlocalclasses;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter

public class UberFareHelper extends Object{



    private static ThreadLocal<Double> markUp = new ThreadLocal();  // t1 {1}    // t2 {2}  // t3 {3}

    private double baseFare = 10;



    public void getCabFare(){
        System.out.println( Thread.currentThread().getName() + " : The price for user  is  : " +  ( baseFare * markUp.get())  );
    }

    public static void setMarkUp(double markUp) {
        System.out.println(Thread.currentThread().getName() + " markup set by thread :  " + markUp);
        UberFareHelper.markUp.set(markUp);
    }
}
