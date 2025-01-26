package org.batch.collections.traversing.interview;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdatingCollectionWhileTraversingRunner {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);  // 4


       for(Integer value : list) {
           System.out.print(value +", ");
           if(value == 3) {
               list.add(4); // modCount = 5
           }
           System.out.println("next value should be : " + (value+1));
       }

    }
}
