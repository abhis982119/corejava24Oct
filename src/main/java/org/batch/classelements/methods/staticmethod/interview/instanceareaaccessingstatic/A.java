package org.batch.classelements.methods.staticmethod.interview.instanceareaaccessingstatic;

public class A {

    public void m1(){
        System.out.println("A-m1()");
        m2();
    }

    public static void m2(){
        System.out.println("A-m2()");
    }


}
