package org.batch.classelements.instanceblock.interview.floworder;

public class A {

    {   //instance-block
        System.out.println("A-instanceblock");
    }

    private int age; //variable

    public A() { //constructor
        System.out.println("A()-constructor");
    }

    public void m1(){  //method
        System.out.println("A-m1()");
    }
}
