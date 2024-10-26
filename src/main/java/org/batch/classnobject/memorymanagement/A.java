package org.batch.classnobject.memorymanagement;

public class A {

    private static int staticVariable; //non-heap
    private int instanceVariable; //heap  //4byte

    public void m1(){
        int localVariable = 0;  //stack
        System.out.println("A-m1()");
    }

}
