package org.batch.exceptionhandling.trycatchfinally.basics;

public class AbnormalTermination extends Object{

    public static void main(String[] args) {

        System.out.println("line-1");
        System.out.println("line-2");
        int a = 10/0;
        System.out.println("line-3");

        System.out.println("code ended");



    }
}
