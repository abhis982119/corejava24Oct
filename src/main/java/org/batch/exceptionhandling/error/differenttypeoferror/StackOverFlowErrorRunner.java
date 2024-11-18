package org.batch.exceptionhandling.error.differenttypeoferror;

public class StackOverFlowErrorRunner {


    public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        System.out.println("m1()");
        m1();
    }
}
