package org.batch.exceptionhandling.trycatchfinally.interview;

public class TryCatchWithThrowable {

    public static void main(String[] args) {

        try{
            System.out.println("line-1");   //check
            System.out.println("line-2");   //check
            int a = 10/0;                   //exception arise
            System.out.println("line-3");
        }catch (Throwable e){
            System.out.println("catch-block with throwable");  //check
        }


        System.out.println("Code executed successfully");  //check
    }
}
