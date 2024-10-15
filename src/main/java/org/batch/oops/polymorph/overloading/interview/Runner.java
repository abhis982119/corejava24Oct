package org.batch.oops.polymorph.overloading.interview;

public class Runner {

    public static void main(String[] args) {
        MyMath math = new MyMath();
        byte a = 10;
        byte b = 20;

        System.out.println( "Sum is : " + math.add(a,b));

    }

}
