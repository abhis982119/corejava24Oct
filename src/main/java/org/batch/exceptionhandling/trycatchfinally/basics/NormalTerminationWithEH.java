package org.batch.exceptionhandling.trycatchfinally.basics;

public class NormalTerminationWithEH {

    public static void main(String[] args) {

        try{
            System.out.println("line-1");
            System.out.println("line-2");
            int a = 10/0;
            System.out.println("line-3");
        }catch(Exception e){
            System.out.println("catch block");
        }

        System.out.println("code ended gracefully");
    }
}
