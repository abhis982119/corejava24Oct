package org.batch.collections.list.basics.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasics {

    public static void main(String[] args) {
        List list = new LinkedList();

        //  Heterogeneous data allowed
        list.add(1);
        list.add(true);
        list.add(null);   // null insertion allowed
        list.add(1.8);
        list.add("Dikshita");  // insertion order is preserved
        list.add("Dikshita");  // duplicates are allowed

        System.out.println("heterogeneous data :  " + list);
    }
}
