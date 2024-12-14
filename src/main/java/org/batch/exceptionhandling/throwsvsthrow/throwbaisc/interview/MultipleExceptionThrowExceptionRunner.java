package org.batch.exceptionhandling.throwsvsthrow.throwbaisc.interview;

public class MultipleExceptionThrowExceptionRunner {


    public static void main(String[] args) {
        try{
            System.out.println("line-1");
            System.out.println("line-2");

             throw new NullPointerException();

         /*
             System.out.println("line-3");   //java: unreachable statement
            System.out.println("line-4");
            */
        }catch (IndexOutOfBoundsException e){
            System.out.println("Catch block - " + e.getMessage());
        }

        System.out.println("code executed successfully");
    }
}
