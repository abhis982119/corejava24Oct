package org.batch.classelements.constructors.interview.chaining;

public class A {

     public A(){
         this(10);
         System.out.println("A()-constructor");
         //  this(10);   //java: call to this must be first statement in constructor
     }

     public A(int a){
         this(10,20);
         System.out.println("A(int)-constructor");
     }

     public A(int a, int b){
         System.out.println("A(int, int)-constructor");
     }
}
