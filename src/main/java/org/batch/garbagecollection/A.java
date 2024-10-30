package org.batch.garbagecollection;

public class A extends  Object{

    private int age = 10;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("A object is being destroyed by GC");
        int sum = 10/0; // no exception object will be entertained by JVM
        System.out.println("finalize method ends");
    }
}
