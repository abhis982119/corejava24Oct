package org.batch.classelements.variables.staticvar;

public class Runner {

    public static void main(String[] args) {
        Basics basics = new Basics();
        basics.m1();
        System.out.println("staticInteger default value with reference-variable : " + basics.staticInteger);
        System.out.println("staticInteger default value with Class reference : " + Basics.staticInteger);

    }
}
