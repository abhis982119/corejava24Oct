package org.batch.oops.inheritence.basics;

public class Runner {

    public static void main(String[] args) {
         A a = new A();
         a.m1();
         a.m2();

        System.out.println("---------------------");

         B b = new B();
         b.m1();
         b.m2();
         b.m3();
         b.m4();
         b.m5();

        System.out.println("---------------------");
        C  c = new C();
        c.m1();


    }
}
