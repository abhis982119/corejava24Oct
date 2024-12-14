package org.batch.exceptionhandling.userdefinedexceptions.compiletimeexception.fileuploadservice;

public class UnsuccessfulFileUploadException extends  Exception{

    public UnsuccessfulFileUploadException(String message) {
        super(message);
    }
}
