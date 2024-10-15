package org.batch.classelements.methods.instanceblock.overflow;

public class A {
     public void m1(){
         System.out.println("A-m1()");
         m1();
     }
}
