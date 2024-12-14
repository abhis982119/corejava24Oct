package org.batch.exceptionhandling.throwsvsthrow.throwsbasics.interviewquestions.delegationchain;

import java.io.FileNotFoundException;

public class B {



    public void m2() throws FileNotFoundException{
      A a = new A();
        a.m1();
    }
}
