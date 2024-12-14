package org.batch.exceptionhandling.throwsvsthrow.throwsbasics.interviewquestions.overridingthrowsmethod;

public class Runner {


    public static void main(String[] args){
        B b = new B();
        b.m1();
     //   b.m2();

        A a = new B();

        try {
            a.m1();
        }catch (Exception e){
            System.out.println("Exception : " + e.getMessage() );
        }



    }
}
