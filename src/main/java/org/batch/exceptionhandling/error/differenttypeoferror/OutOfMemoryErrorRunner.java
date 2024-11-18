package org.batch.exceptionhandling.error.differenttypeoferror;

import org.batch.accessmodifiers.model.A;

public class OutOfMemoryErrorRunner {


    public static void main(String[] args) {

        int[] arr = new int[1000000000]; //Java heap space
        System.out.println("Code executed successfully");

    }
}
