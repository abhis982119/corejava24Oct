package org.batch.exceptionhandling.trycatchfinally.interview;

public class NestedTryCatch {


    public static void main(String[] args) {
        try{
            try{
                System.out.println("line-1");  //
                int a = 10/0;
                System.out.println("line-2");
            }catch (NullPointerException e){
                System.out.println("TryTry-CatchBlock ");
                int a = 10/0;
            }

        }catch (Exception e){
            System.out.println("Try-CatchBlock "); //
            try{
                int a = 10/0;
            }catch (Error ex){
                System.out.println("TryCatchTry-CatchBlock ");
            }

        }

        System.out.println("Code executed successfully");
    }
}
