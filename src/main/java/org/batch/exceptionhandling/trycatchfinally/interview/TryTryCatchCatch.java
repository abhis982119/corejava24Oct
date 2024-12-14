package org.batch.exceptionhandling.trycatchfinally.interview;

public class TryTryCatchCatch {

    public static void main(String[] args) {

        try {
            System.out.println("line-1");
            try {
                int a = 10/0;
                System.out.println("line-2");
            } catch (NullPointerException e) {
                System.out.println("Catch block of inner-try");
            }
        } catch (Exception e) {
            System.out.println("Catch block of outer-try");
        }
        System.out.println("code executed gracefully");
    }
}
