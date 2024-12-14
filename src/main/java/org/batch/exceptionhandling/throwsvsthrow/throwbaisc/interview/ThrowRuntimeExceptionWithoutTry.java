package org.batch.exceptionhandling.throwsvsthrow.throwbaisc.interview;

public class ThrowRuntimeExceptionWithoutTry {


    public static void main(String[] args) {


        System.out.println("line-1");
        System.out.println("line-2");

        throw new RuntimeException("My Exception");
    }
}
