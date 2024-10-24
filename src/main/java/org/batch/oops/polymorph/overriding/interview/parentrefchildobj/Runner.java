package org.batch.oops.polymorph.overriding.interview.parentrefchildobj;

public class Runner {

    public static void main(String[] args) {
        A a = new A();
        a.m1();          //A-m1()
      //  a.m2();

        B b = new B();
        b.m1();            //A-m1()


        A ab = new B();
        ab.m1();             //A-m1()
        //      ab.m2();

    /*
        B ba = new A();   // ChildClass Reference variable cannot hold Parent Class object
        ba.m1();            //A-m1()
        ba.m2();
     */





    }
}
