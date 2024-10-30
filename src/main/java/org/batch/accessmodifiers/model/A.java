package org.batch.accessmodifiers.model;

public class A {


    public void m1(){
        System.out.println("A-m1() - Public");
    }


    protected void m2(){
        System.out.println("A-m2() - protected");
    }


     void m3(){
        System.out.println("A-m3() - default");
    }


    private void m4(){
        System.out.println("A-m4() - private ");
    }
}
