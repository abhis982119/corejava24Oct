package org.batch.classelements.methods.instanceblock.methodchaining;

public class A {


    public void m1(){
        System.out.println("A-m1() starts");
        m2();
        System.out.println("A-m1() ends");
    }

    public void m2(){
        System.out.println("A-m2() start");
        System.out.println("A-m2() ends");
    }



}
