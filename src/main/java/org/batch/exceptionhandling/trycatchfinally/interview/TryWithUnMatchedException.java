package org.batch.exceptionhandling.trycatchfinally.interview;

public class TryWithUnMatchedException {


    public static void main(String[] args) {
        try{
            System.out.println("line-1");
            System.out.println("line-2");
            System.out.println("line-3");
            int a = 10/0;                   //java.lang.ArithmeticException: / by zero
            System.out.println("line-4");
            System.out.println("line-5");
        }catch (NullPointerException e ){
            System.out.println("Catch block  NullPointerException" );
        }

        System.out.println("code completed gracefully");
    }
}
