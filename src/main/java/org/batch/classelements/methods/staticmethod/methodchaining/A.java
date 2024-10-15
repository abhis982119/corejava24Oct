package org.batch.classelements.methods.staticmethod.methodchaining;

public class A {

    public static void m1(){
        System.out.println("A-m1() -static start");
        m2();
        System.out.println("A-m1() -static ends");
    }

    public static void m2(){
        System.out.println("A-m2() -static start" );
        System.out.println("A-m2() -static ends");
    }
}
