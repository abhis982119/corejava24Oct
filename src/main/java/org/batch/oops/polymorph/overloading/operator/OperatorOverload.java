package org.batch.oops.polymorph.overloading.operator;

public class OperatorOverload {
   /*
       Operator overloading : is not allowed

       There is one inbuild overloaded operator : +

    */

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a+b);
        System.out.println("D"+a+b);   //D1020
        System.out.println(a+b+"D");   //30D
        System.out.println("D"+(a+b)); //D30
        System.out.println((a+b)+"D"); //30D

    }
}
