package org.batch.exceptionhandling.trycatchfinally.interview;

public class MultipleCatchWithExcptionAndError {

    public static void main(String[] args) {
        try{
            System.out.println("line-1");
            System.out.println("line-2");
            throw new IllegalAccessError();
        }catch (Error e){
            System.out.println("Error : Catch block - " + e.getMessage());
        }catch (Exception e){
            System.out.println("Exception : Catch block - " + e.getMessage());
        }catch (Throwable e){
            System.out.println("Exception : Catch block - " + e.getMessage());
        }
        System.out.println("code executed successfully");
    }
}
