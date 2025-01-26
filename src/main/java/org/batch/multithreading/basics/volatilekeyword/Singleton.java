package org.batch.multithreading.basics.volatilekeyword;

public class Singleton {

    private volatile static Singleton instance;

    public static   Singleton getInstance(){
        if(instance == null){   // t1, t2, t3
            synchronized (Singleton.class) {   // t2,t3 : waiting  //t1: getlock
                if(instance == null) {
                    instance = new Singleton();    //t2
                }
            }
        } //t1
        return instance;
    }

}
