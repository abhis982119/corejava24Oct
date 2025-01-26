package org.batch.collections.setinterface;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetRunner {

    public static void main(String[] args) {
        Set<Integer> values = new TreeSet();

        values.add(4); //insertion order is not preserved
        values.add(5);
        values.add(1);
        values.add(1);  // doesn't support duplicates
        values.add(2);
        values.add(3);
     //   values.add(null); // null is not allowed cause of sorting


        System.out.println("set : " + values);
    }
}
