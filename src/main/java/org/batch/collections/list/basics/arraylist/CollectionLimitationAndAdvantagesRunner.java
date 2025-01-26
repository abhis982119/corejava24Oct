package org.batch.collections.list.basics.arraylist;

import org.batch.classelements.constructors.chaining.A;
import org.batch.collections.model.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionLimitationAndAdvantagesRunner {


    public static void main(String[] args) {
        //Collections are used to store both heterogeneous data(different type)& homogeneous data.
        List differentDataTypes = new ArrayList();
        differentDataTypes.add(Boolean.TRUE);  //boolean
        differentDataTypes.add("Dikshita"); // String
        differentDataTypes.add(123);  // int
        differentDataTypes.add(123.4); //double
        differentDataTypes.add(123l);  //long


        System.out.println("differentDataTypes : " + differentDataTypes);


      //Collections are capable to store only object data.
        List canStoreOnlyObjects = new ArrayList();
        int a = 10;
        canStoreOnlyObjects.add(a);    // autoboxing
        System.out.println("canStoreOnlyObjects :  " + canStoreOnlyObjects);


        List<Integer> numbers = new ArrayList<>(2);   //[1 2]  ---> [1 2 3 _ ]   --> [1 2 3 4  _ _ _ _]
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("numbers : " + numbers);





        Object[] arr = new Object[2];
        arr[0] = 1; // autoboxing
        arr[1] = Boolean.TRUE;



        for(Object value : arr){
            if( value instanceof Integer) {
                System.out.println(value);
            }
        }

    }
}
