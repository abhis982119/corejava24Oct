package org.batch.collections.traversing.interview;

import java.util.Arrays;
import java.util.List;

public class ModifyingArraysAsListListRunner {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5);


        for(Integer value : list){
            System.out.print(value + ", ");
            if(value == 2){
                list.add(4);
            }
        }

        list.add(123);

    }
}
