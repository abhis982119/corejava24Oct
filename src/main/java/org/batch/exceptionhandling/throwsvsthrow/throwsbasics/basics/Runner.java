package org.batch.exceptionhandling.throwsvsthrow.throwsbasics.basics;

import java.io.FileNotFoundException;

public class Runner {


    public static void main(String[] args) throws FileNotFoundException {

        MyFileReader fileReader = new MyFileReader();
        fileReader.printFileData("/users/docs/fileToRead.txt");

    }
}
