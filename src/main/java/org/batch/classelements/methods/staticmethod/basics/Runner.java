package org.batch.classelements.methods.staticmethod.basics;

public class Runner {
    public static void main(String[] args) {

        A.m1();  // Direct-Access using className


        A a = new A();
        a.m1();  // using reference variable : NOT-RECOMMENDED
    }
}
