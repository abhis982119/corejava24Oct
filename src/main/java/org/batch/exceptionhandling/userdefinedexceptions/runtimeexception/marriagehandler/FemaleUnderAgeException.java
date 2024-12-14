package org.batch.exceptionhandling.userdefinedexceptions.runtimeexception.marriagehandler;

public class FemaleUnderAgeException extends RuntimeException{

    public FemaleUnderAgeException(String message) {
        super(message);
    }
}
