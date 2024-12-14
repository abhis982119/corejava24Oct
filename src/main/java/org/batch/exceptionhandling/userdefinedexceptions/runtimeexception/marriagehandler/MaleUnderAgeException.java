package org.batch.exceptionhandling.userdefinedexceptions.runtimeexception.marriagehandler;

public class MaleUnderAgeException extends  RuntimeException{

    public MaleUnderAgeException(String message) {
        super(message);
    }
}
