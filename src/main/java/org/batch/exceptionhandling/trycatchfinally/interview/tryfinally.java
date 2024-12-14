package org.batch.exceptionhandling.trycatchfinally.interview;

public class tryfinally {

    public static void main(String[] args) {
        try{
            System.out.println("line-1");
            System.out.println("line-2");
            //opened database connection
            int a  = 10/0;
            System.out.println("line-3");
        }finally {
            System.out.println("finally block");
        }
    }
}
