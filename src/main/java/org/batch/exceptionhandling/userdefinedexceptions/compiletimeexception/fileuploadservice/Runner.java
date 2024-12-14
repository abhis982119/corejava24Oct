package org.batch.exceptionhandling.userdefinedexceptions.compiletimeexception.fileuploadservice;

public class Runner {

    public static void main(String[] args) throws Exception {
        MyFile myFile = new MyFile("marriage_photo", FileFormat.PNG, 20);
        FileUploader.uploadFile(myFile);
    }
}
