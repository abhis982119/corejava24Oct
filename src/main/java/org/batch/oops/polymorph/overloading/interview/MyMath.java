package org.batch.oops.polymorph.overloading.interview;

public class MyMath {
    public int add(byte a, int b) {  // 2 time upcast
        System.out.println("MyMath.add(byte,int)");
        return a + b;
    }


    public int add(int a, int b) {  // 4 upcast
        System.out.println("MyMath.add(int,int)");
        return a + b;
    }



    public long add(long a, int b) {  //6 upcast
        System.out.println("MyMath.add(long,long)");
        return a + b;
    }


    public float add(float a, int b) { // 6 upcast
        System.out.println("MyMath.add(float,int)");
        return a + b;
    }

    public float add(int a, float b) {  //upcast
        System.out.println("MyMath.add(float,float)");
        return a + b;
    }


    public double add(double a, int b) {
        System.out.println("MyMath.add(double,int)");
        return a + b;
    }










/*

    public int add(byte a, byte b) {
        System.out.println("MyMath.add(byte,byte)");
        return a + b;
    }


    public int add(short a, short b) {
        System.out.println("MyMath.add(short,short)");
        return a + b;
    }

    public int add(int a, int b) {
        System.out.println("MyMath.add(int,int)");
        return a + b;
    }

    public long  add(long a, long b){
        System.out.println("MyMath.add(long,long)");
        return a+b;
    }



    public float add(float a, float b){
        System.out.println("MyMath.add(float,float)");
        return a+b;
    }

    public double add(double a, double b){
        System.out.println("MyMath.add(double,double)");
        return a+b;
    }
*/




}
