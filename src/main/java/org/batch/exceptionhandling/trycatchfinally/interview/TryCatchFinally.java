package org.batch.exceptionhandling.trycatchfinally.interview;

public class TryCatchFinally {


    public static void main(String[] args) {
        System.out.println("line-1");
        try{
            System.out.println("line-2");
            System.out.println("line-3");
        }catch (Exception e){
            System.out.println("catch-block");
        }finally {
            System.out.println("finally block");
        }
        System.out.println("code executed successfully");
    }
}
