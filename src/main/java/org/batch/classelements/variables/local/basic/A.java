package org.batch.classelements.variables.local.basic;

public class A {
/*
  ---------------------------------------------
   LOCAL
  ---------------------------------------------
  scope of variable
  size of a variable (including range)
  default values                                 : Not provided
  language memory name (logical memory name)     : stack memory
  hardware memory name                           : RAM
  memory management ( occupied and free )        : when method starts, when method ends
  access                                         : directly
 */


    public void m1(){
        int a  = 10; // local variable
        System.out.println(a);
    }


}
