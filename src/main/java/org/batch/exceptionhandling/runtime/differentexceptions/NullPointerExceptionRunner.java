package org.batch.exceptionhandling.runtime.differentexceptions;

import jdk.swing.interop.SwingInterOpUtils;
import org.batch.accessmodifiers.model.A;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {

        try {
            System.out.println("line-1");
            System.out.println("line-2");

            A a = null;
            a.m1();

            System.out.println("line-3");
            System.out.println("line-4");


        }catch (NullPointerException e){
            System.out.println("catch block " + e.getMessage());
        }

        System.out.println("Code executed gracefully");

    }
}
