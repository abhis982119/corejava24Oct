package org.batch.exceptionhandling.userdefinedexceptions.compiletimeexception.fileuploadservice;

public class FileUploader {

    public static void uploadFile(MyFile myFile) throws UnsuccessfulFileUploadException{

        if(!myFile.getFileFormat().equals(FileFormat.PNG)){
            throw new UnsuccessfulFileUploadException("Only PNG format supported");
        }

        if(myFile.getSize() > 5){
            throw new UnsuccessfulFileUploadException("Max-File size supported is 5 mb");
        }
        System.out.println("File uploaded successfully : " + myFile.getFileName());
    }
}
