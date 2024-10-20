package org.batch.classelements.staticblock.interview.multipleobjectscreation;

public class A {

    static { //static-block
        System.out.println("A-static-block");
    }

    {  //instance-block
        System.out.println("A-instance-block");
    }

    public A() { //constructor
        System.out.println("A()-constructor");
    }
}
