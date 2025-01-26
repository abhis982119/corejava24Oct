package org.batch.collections.sorting.list.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Temp {


    public static void main(String[] args) {
        List<Integer> intList = new ArrayList();
        intList.add(2);
        intList.add(1);
        intList.add(3);
        System.out.println(intList);

        Collections.sort(intList);
        System.out.println(intList);

    }
}
