package org.batch.collections.traversing.list.iterator.interviewquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailSafeCollectionRunner {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        for(int i = 1; i <= 5; i++){
            list.add(i);
        }

        System.out.println(list);

        for(Integer val : list){   // modCount = 5
            System.out.println(val);

            if(val == 3) {
                list.remove(1);  //  // modCount = 6
            }
        }

        System.out.println("Updated list : " + list);
    }
}
