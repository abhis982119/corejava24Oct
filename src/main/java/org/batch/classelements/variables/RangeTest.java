package org.batch.classelements.variables;

import java.util.Random;

public class RangeTest {

    public static void main(String[] args) {

        int a = new Random().nextInt();
        System.out.println("Random integer : " +  a);

        System.out.println("  Byte.MAX_VALUE  : " +   Byte.MAX_VALUE );
        System.out.println("  Byte.MIN_VALUE  : " +   Byte.MIN_VALUE );
        
        System.out.println("  Short.MAX_VALUE : " +   Short.MAX_VALUE );
        System.out.println("  Short.MIN_VALUE  : " +   Short.MIN_VALUE );

        System.out.println(" Integer.MAX_VALUE : " +   Integer.MAX_VALUE );
        System.out.println(" Integer.MIN_VALUE : " +   Integer.MIN_VALUE );
    }

}
