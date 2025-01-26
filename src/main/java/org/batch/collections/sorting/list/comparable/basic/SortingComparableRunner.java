package org.batch.collections.sorting.list.comparable.basic;

import java.util.*;

public class SortingComparableRunner {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);

        System.out.println( "Before sorting :  " + list);

        Collections.sort(list);

        System.out.println( "After sorting : " + list);




        List<Character> charList = new ArrayList<>();
        charList.add('D');
        charList.add('A');
        charList.add('C');
        charList.add('B');

        System.out.println( "Before sorting :  " + charList);

        Collections.sort(charList);

        System.out.println( "After sorting : " + charList);
    }
}
