package org.batch.classelements.methods.staticmethod.interview.staticareaaccessinginstance;

public class A {

    int a = 10; //object is created
    static int b = 20;

    public static void m1() {
        System.out.println("A-m1()");
        System.out.println("value of b : " + b );
     // System.out.println("value of a : " + a);
    }


    public void m2(){
        System.out.println("A-m1()");
    }




}
