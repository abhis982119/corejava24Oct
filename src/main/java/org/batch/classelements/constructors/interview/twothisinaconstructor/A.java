package org.batch.classelements.constructors.interview.twothisinaconstructor;

public class A {

    public A() {
          this(10);
      //  this(10); //java: call to this must be first statement in constructor
        System.out.println("A()-constructor");

    }

    public A(int a) {
        System.out.println("A(int)-constructor");
    }


}
