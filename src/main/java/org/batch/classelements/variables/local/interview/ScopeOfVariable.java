package org.batch.classelements.variables.local.interview;

public class ScopeOfVariable {


    public void m1(){
        int a  = 1; // declaration + initialization
        System.out.println("value of a "+ a);  // 1

        while(a < 2){
            a++;
            int b = 20;
        }

    //    System.out.println("value of b : " + b); // cannot find symbol
    }


    public void m2(){
        int a  = 1; // declaration
        System.out.println("value of a "+ a);  //  1

        {
            int b = 2;
            a = a - b;
            System.out.println("value of b "+ b);  //
        }

         System.out.println("value of a "+ a);  //  -1
       //  System.out.println("value of b "+ b);  //  cannot find symbol

    }
}
