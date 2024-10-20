package org.batch.classelements.staticblock.basic;

public class A {
    static{ //static-block
        System.out.println("A-static -block");
        age = 20;
    }

    { //instance-block
        System.out.println("A-instance-block");
    }
    public A() {
        System.out.println("A()-constructor");
    }
    static int age = 10; //variable

    public void m1(){
        System.out.println("A-m1()");
    }
}
