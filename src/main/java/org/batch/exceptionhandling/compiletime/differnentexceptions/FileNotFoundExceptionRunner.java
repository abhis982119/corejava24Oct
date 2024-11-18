package org.batch.exceptionhandling.compiletime.differnentexceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionRunner {

    public static void main(String[] args) throws Exception {
        try {
          //  String filePath = "/Users/abhisheksharma/filetoread.txt";
             String filePath = "filetoread.txt";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }


        }catch (FileNotFoundException ex){
            System.out.println("catch block : " + ex.getMessage());
        }

        System.out.println("Code ended gracefully");
    }
}
