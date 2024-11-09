package org.batch.wrapperclassses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {


    public static void main(String[] args) {

        int a = 10;
        Integer b = Integer.parseInt("10");

        System.out.println("value of primitive int : " + a);
        System.out.println("value of Object Integer : " + b);


        int primitiveInteger = Integer.parseInt("100");
        Integer wrapperInteger = Integer.valueOf("100");

        System.out.println(primitiveInteger);
        System.out.println(wrapperInteger);

    }
}
