package org.batch.classelements.instanceblock.interview.multipleinitializing;

public class A {

    {   //instance-block
        System.out.println("A-instanceblock");
        age = 10;
    }

    private int age ;

    public A(int age) { //constructor
        System.out.println("A()-constructor");
        this.age = age;
    }

    public void m1() {  //method
        System.out.println("A-m1() with value of age : " + age);
    }
}
