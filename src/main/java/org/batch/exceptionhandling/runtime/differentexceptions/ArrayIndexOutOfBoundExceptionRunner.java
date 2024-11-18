package org.batch.exceptionhandling.runtime.differentexceptions;

public class ArrayIndexOutOfBoundExceptionRunner {

    public static void main(String[] args) {

        try {
            int[] arr = new int[]{0, 1, 2};

            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("catch block : " + ex.getMessage());
        }

        System.out.println("Code executed successfully");
    }
}
