package org.batch.exceptionhandling.throwsvsthrow.throwbaisc.basic;

public class ThrowArithmeticExceptionRunner {


    public static void main(String[] args) {

        try{
            System.out.println("line-1");
            System.out.println("line-2");

           throw new ArithmeticException("");  //is it possible for us to : throw ArithmeticException
        }catch (NullPointerException e){
            System.out.println("catch block : " + e.getMessage());
        }

        System.out.println("code executed successfully");
    }
}
