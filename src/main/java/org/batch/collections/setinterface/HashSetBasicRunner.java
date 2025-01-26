package org.batch.collections.setinterface;

import java.util.Set;

public class HashSetBasicRunner {

    public static void main(String[] args) {

        Set<Integer> values = new java.util.HashSet<>();
          //insertion order is not preserved
        values.add(4);
        values.add(5);
        values.add(1);
        values.add(1);  // doesn't support duplicates
        values.add(2);
        values.add(3);
        values.add(null);
        values.add(null); //Null insertion is possible but if we are inserting more than one null it return only one null value


        System.out.println("set : " + values);
    }
}
