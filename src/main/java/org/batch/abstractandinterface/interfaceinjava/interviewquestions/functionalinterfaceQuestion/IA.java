package org.batch.abstractandinterface.interfaceinjava.interviewquestions.functionalinterfaceQuestion;

/*
Functional Interface : There should be one and only one abstract method
 */

import java.util.Comparator;

@FunctionalInterface
public interface IA {
    void m1();

    default void m2(){
        System.out.println("A-m2()");
    }


}
