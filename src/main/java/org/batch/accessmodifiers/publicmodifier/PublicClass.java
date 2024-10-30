package org.batch.accessmodifiers.publicmodifier;

public class PublicClass {


   public void m1(){
       System.out.println(getClass().getCanonicalName() + "-m1() ");
   }
}
