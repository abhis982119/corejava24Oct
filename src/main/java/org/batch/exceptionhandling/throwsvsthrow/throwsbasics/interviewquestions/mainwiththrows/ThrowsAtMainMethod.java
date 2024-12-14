package org.batch.exceptionhandling.throwsvsthrow.throwsbasics.interviewquestions.mainwiththrows;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrowsAtMainMethod {


    public static void main(String[] args) throws FileNotFoundException   {
        System.out.println("line-1");
        throw new FileNotFoundException();
    }
}
