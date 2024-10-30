package org.batch.accessmodifiers.interview.overrdingaccessprivilege;

public class A {


    public void m1(){
        System.out.println("A-m1() : public ");
    }


    void m2(){
        System.out.println("A-m2()  : default ");
    }
}
