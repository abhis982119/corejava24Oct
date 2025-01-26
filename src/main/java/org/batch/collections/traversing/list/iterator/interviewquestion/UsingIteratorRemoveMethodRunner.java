package org.batch.collections.traversing.list.iterator.interviewquestion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingIteratorRemoveMethodRunner {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);  // 4

        //    i-->
        // [1,2,3,4]
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            int value = itr.next();
            System.out.print(value +", ");
            if(value == 2) {
              //  list.remove(3); // modCount = 5
                itr.remove();
            }
            System.out.println("next value should be : " + (value+1));
        }

        System.out.println("modified list : " + list);
    }
}
