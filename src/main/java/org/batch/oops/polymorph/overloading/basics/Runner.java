package org.batch.oops.polymorph.overloading.basics;

public class Runner {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        MyMath math = new MyMath();
        int sum = math.add(a,b);
        System.out.println("Sum of a + b  = " + sum);


        float c = 30;
        float d = 40;
        float  floatSum = math.add(c,d);
        System.out.println("Sum of c + d = " + floatSum );


    }
}
