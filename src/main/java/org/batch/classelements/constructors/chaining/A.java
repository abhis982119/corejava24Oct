package org.batch.classelements.constructors.chaining;

public class A {

     public A(){
         this(10);
         System.out.println("A()-constructor");
     }
     public A(int a){
         this(10,20);
         System.out.println("A(int)-constructor");
     }
     public A(int a, int b){
         System.out.println("A(int, int)-constructor");
     }
}
