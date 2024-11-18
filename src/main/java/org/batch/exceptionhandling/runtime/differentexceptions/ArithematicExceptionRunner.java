package org.batch.exceptionhandling.runtime.differentexceptions;

public class ArithematicExceptionRunner {


    public static void main(String[] args) {
        try {
            System.out.println("line-1");
            System.out.println("line-2");
            int a = 10 / 0;
            System.out.println("line-3");
            System.out.println("line-4");
        }catch (ArithmeticException e){
            System.out.println("catch block " + e.getMessage());
        }

        System.out.println("code executed gracefully");
    }
}
