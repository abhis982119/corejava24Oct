package org.batch.exceptionhandling.throwsvsthrow.throwsbasics.interviewquestions.delegationchain;

import java.io.FileNotFoundException;

public class C {

    public void m3() throws FileNotFoundException {
        B b = new B();
        b.m2();
    }
}
