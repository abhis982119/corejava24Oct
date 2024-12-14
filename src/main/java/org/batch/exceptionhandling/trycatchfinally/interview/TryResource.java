package org.batch.exceptionhandling.trycatchfinally.interview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResource {


    public static void main(String[] args) {
        String filePath = "/Users/abhisheksharma/filetoread.txt";
        // String filePath = "filetoread.txt";
        try( BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (FileNotFoundException ex){
            System.out.println("catch block : " + ex.getMessage());
        }catch (IOException ex){
            System.out.println("catch block : " + ex.getMessage());
        }catch (Exception e){
            System.out.println("Unhandled exception arised.");
            //UnHandledExceptionUtility.sendAlert(e);
        }
        System.out.println("Code ended gracefully");
    }
}
