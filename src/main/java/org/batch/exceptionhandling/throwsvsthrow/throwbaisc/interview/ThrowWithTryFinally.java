package org.batch.exceptionhandling.throwsvsthrow.throwbaisc.interview;

import java.io.FileNotFoundException;

public class ThrowWithTryFinally {


    public static void main(String[] args) {
        try{
            System.out.println("line-1");
            System.out.println("line-2");
         //   throw new ArithmeticException("Manual ArithmeticException()");
         //   throw new FileNotFoundException("Manual ArithmeticException()");

        }finally{
               System.out.println("Finally block ");
        }

    }
}
