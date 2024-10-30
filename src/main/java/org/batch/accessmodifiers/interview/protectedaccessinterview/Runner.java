package org.batch.accessmodifiers.interview.protectedaccessinterview;

import org.batch.accessmodifiers.model.A;

public class Runner {



    public static void main(String[] args) {
        A a = new A();
     //   a.m1();     //public
     //   a.m2();   // java: m2() has protected access in org.batch.accessmodifiers.model.A


        B b = new B();
        b.m1();
   //   b.m2();
    }
}
