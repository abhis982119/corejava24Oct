package org.batch.multithreading.basics.volatilekeyword;

public class SingletonRunner {

    public static void main(String[] args) {
        Singleton s1 = new Singleton();
        Singleton s2 = new Singleton();


        if(s1 == s2){
            System.out.println("Both objects are same");
        }else{
            System.out.println("Both objects are not same");
        }
    }
}
