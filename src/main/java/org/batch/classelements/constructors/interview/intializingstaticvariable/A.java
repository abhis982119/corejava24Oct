package org.batch.classelements.constructors.interview.intializingstaticvariable;

public class A {

    static int age;

    public  A(int age) {
        this.age = age;   //Not recommended
    }

    @Override
    public String toString() {
        return "A{ "
                + age +
                "}";
    }
}
