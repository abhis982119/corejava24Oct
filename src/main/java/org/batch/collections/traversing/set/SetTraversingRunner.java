package org.batch.collections.traversing.set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTraversingRunner {

    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>();
        //insertion order is not preserved
        values.add(4);
        values.add(5);
        values.add(1);
        values.add(1);  // doesn't support duplicates
        values.add(2);
        values.add(3);

        System.out.println("set : " + values);



        //Legacy for loop     : doesn't work with set.
        // for-each loop

        System.out.println("Traversing using for-each loop");
        for(Integer value : values){
            System.out.print(value + ", ");
        }
        System.out.println();
        //iterator

        System.out.println("Traversing using iterator");
        Iterator<Integer> itr = values.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() +", ");
        }
        System.out.println();

        //list-iterator     : list iterator work with list only

        //streams
        System.out.println("Traversing using streams");
        values.stream().forEach(value -> System.out.print(value + ", "));
    }
}
