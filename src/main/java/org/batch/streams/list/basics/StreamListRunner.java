package org.batch.streams.list.basics;

import java.util.Arrays;
import java.util.List;

public class StreamListRunner {


    public static void main(String[] args) {
        List<Integer>  list = Arrays.asList(1,2,3,4);
        System.out.println("list : " + list);
         //         i -->
        // [ 1 2 3 4 ]
        for(int i = 0; i < list.size() ; i++){
            System.out.print(list.get(i) + "," );
        }


        // Introduced in 1.5
        System.out.println();
        System.out.println("Traversing using for-each loop");
        //         i -->
        // [ 1 2 3 4 ]
        for(Integer value   : list){
            System.out.print(value + "," );
        }


        System.out.println();
        //Introduced in 1.8
        System.out.println("Traversing using streams");
        //   i -->
        // [ 1 2 3 4 ]

        list.stream().forEach(value ->  System.out.print(value + "," ));


    }
}
