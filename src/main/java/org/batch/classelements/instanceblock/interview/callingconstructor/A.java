package org.batch.classelements.instanceblock.interview.callingconstructor;

import org.batch.specialkeywords.thiskeyword.variables.Student;

public class A {

    {
   //     this();  //Constructor calling of self can be done from a constructor only
        System.out.println("A-instanceblock");
        age = 10;
    }

    private int age ;

    public A() {
        System.out.println("A()-constructor");
    }

    public A(int age) { //constructor
        System.out.println("A()-constructor");
        this.age = age;
    }


    public void m1() {  //method
        System.out.println("A-m1() with value of age : " + age);
    }
}
