package org.batch.exceptionhandling.trycatchfinally.interview;

public class TryCatchTryCatch {

    public static void main(String[] args) {
        try{
            System.out.println("line-1");
            int a = 10/0;
            System.out.println("line-2");
        }catch (ArithmeticException e){
            System.out.println("CatchBlock of exception");
            try{
                System.out.println("line-3");
                int c = 4/0;
            }catch (ArithmeticException ex) {
                System.out.println("Nested CatchBlock ");
            }
            System.out.println("line-4");
        }

        System.out.println("Code executed gracefully");
    }
}
