package org.batch.exceptionhandling.runtime.differentexceptions;

import org.batch.exceptionhandling.runtime.model.ClassToBeDeleted;

public class ClassDefNotFoundExceptionRunner {


    public static void main(String[] args) {
        ClassToBeDeleted classToBeDeleted = new ClassToBeDeleted();
        classToBeDeleted.m1();
    }
}
