package org.batch.abstractandinterface.interfaceinjava.interviewquestions.methodwithinterface;

public class Runner {


    public static void main(String[] args) {
        A a = new A();
        a.m1();   // A class public method
        a.m2();  //  IA interface default method

        IA.m4();
    }
}
