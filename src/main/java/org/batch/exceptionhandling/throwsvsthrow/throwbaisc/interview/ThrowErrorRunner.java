package org.batch.exceptionhandling.throwsvsthrow.throwbaisc.interview;

public class ThrowErrorRunner {


    public static void main(String[] args) {
        try{
            System.out.println("line-1");
            System.out.println("line-2");
            throw new IllegalAccessError();
        }catch (Error e){
            System.out.println("Catch block - " + e.getMessage());
        }

        System.out.println("code executed successfully");
    }
}
