package org.batch.exceptionhandling.throwsvsthrow.throwsbasics.interviewquestions.overridingthrowsmethod;

import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class B extends A {


   @Override
    public void m1()  {
        System.out.println("B-m1()");
    }


 /*

  @Override
     public void m2() throws FileNotFoundException {  //overridden method does not throw java.io.FileNotFoundException
        System.out.println("A-m2()");
    }

 */



}
