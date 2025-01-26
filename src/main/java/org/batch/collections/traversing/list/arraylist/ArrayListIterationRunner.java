package org.batch.collections.traversing.list.arraylist;

import java.util.*;

public class ArrayListIterationRunner {

    public static void main(String[] args) {

                                          //    i-->
        List<Integer> values =  Arrays.asList(1,2,3,4);


        System.out.println("Traversal using for-loop");
        for(int i = 0; i < values.size(); i++){
            System.out.print(values.get(i) +", ");
        }

        System.out.println();


        System.out.println("Traverse use for-each loop");
        for(int value  : values){
            System.out.print(value + ", ");
        }

        System.out.println();

        System.out.println("Traversing using iterator");
        Iterator<Integer>  itr =  values.iterator();

        //   [1,2,3,4]
        while(itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }

        System.out.println();

        System.out.println("Traversing using list-iterator");
        ListIterator listItr = values.listIterator();

        while(listItr.hasNext()){
            System.out.print(listItr.next() +", ");
        }

    //[1,2,3,4]
        System.out.println();
        System.out.println("Traversing using stream");
        values.stream().forEach(value -> System.out.print(value + ", "));

    }
}
