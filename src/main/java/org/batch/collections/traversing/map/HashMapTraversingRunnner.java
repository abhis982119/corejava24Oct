package org.batch.collections.traversing.map;

import java.util.*;

public class HashMapTraversingRunnner {


    public static void main(String[] args) {
        Map<String, String> countryCityMap = new HashMap<>();
        countryCityMap.put("India", "Delhi");   // Doesn't support insertion order
        countryCityMap.put("China", "Beijing");
        countryCityMap.put("USA", "Washington DC");
        countryCityMap.put("India", "Delhi");  // Duplicate keys not allowed
        countryCityMap.put("SouthAfrica", "Delhi"); // values can be duplicate

        countryCityMap.put("India", "New Delhi"); // it will update the value of the key



        System.out.println("countryCityMap : " + countryCityMap);



        //legacy for-loop  : cannot use it, doesn't implement RamdomAccess
        // for-each loop

        System.out.println("For-each loop using keys only");
        for(String country : countryCityMap.keySet()){
            System.out.print(country + ", ");
        }


        System.out.println();
        System.out.println("For-each loop using values only");
        for(String capital : countryCityMap.values()){
            System.out.print(capital + ", ");
        }


        System.out.println();
        System.out.println("For-each loop using entry ");
        for(Map.Entry<String,String>  entry : countryCityMap.entrySet()){
            System.out.println(entry.getKey() + " :  " + entry.getValue());
        }



        // iterator
        System.out.println();
        System.out.println(" Traversing using Iterator on entryset ");
       Iterator itr =  countryCityMap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String, String> entry = (Map.Entry<String, String>) itr.next();
            System.out.println(entry.getKey() + " :  " + entry.getValue());;
        }


        // list-iterator  : Work with only list

        // streams
        System.out.println();
        System.out.println("Traversing using stream  on keySet ");
        countryCityMap.keySet().stream().forEach(country -> System.out.print(country +", "));


        System.out.println();
        System.out.println("Traversing using stream  on values ");
        countryCityMap.values().stream().forEach(capital -> System.out.print(capital +", "));


        System.out.println();
        System.out.println("Traversing using stream  on keySet ");
        countryCityMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

    }
}
