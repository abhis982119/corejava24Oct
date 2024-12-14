package org.batch.exceptionhandling.throwsvsthrow.throwbaisc.interview;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrowCompileTimeExceptionWithoutTry {


    public static void main(String[] args)  {

        System.out.println("lin-1");
        System.out.println("lin-2");

 //       throw new FileNotFoundException(); //java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown

    }
}
