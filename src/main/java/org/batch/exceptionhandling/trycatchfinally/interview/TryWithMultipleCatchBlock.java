package org.batch.exceptionhandling.trycatchfinally.interview;

public class TryWithMultipleCatchBlock {

    public static void main(String[] args) {

        try{
            System.out.println("line-1");
            System.out.println("line-2");
            Object a = null;              //NullPointerException
            a.getClass();
            System.out.println("line-3");
            int b = 10/0;                   //java.lang.ArithmeticException: / by zero
            System.out.println("line-4");
            System.out.println("line-5");
        }catch (ArithmeticException e ){
            System.out.println("Catch block  ArithmeticException" );
        }catch(NullPointerException e){
            System.out.println("Catch block NullPointerException");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Catch block NullPointerException");
        }

        System.out.println("Code completed gracefully");
    }
}
