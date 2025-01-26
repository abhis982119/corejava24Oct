package org.batch.collections.map.hashmap;

import java.util.*;

public class HashMapBasics {

    public static void main(String[] args) {

        Map<String, String> countryCityMap = new HashMap<>();
        countryCityMap.put("India", "Delhi");   // Doesn't support insertion order
        countryCityMap.put("China", "Beijing");
        countryCityMap.put("USA", "Washington DC");
        countryCityMap.put("India", "Delhi");  // Duplicate keys not allowed
        countryCityMap.put("SouthAfrica", "Delhi"); // values can be duplicate

        countryCityMap.put("India", "New Delhi"); // it will update the value of the key



        System.out.println("countryCityMap : " + countryCityMap);


    }
}
