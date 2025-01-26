package org.batch.collections.map.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapRunner {

    public static void main(String[] args) {

        Map<String, String> countryCityMap = new LinkedHashMap<>(0);
        countryCityMap.put("India", "Delhi");   //  support insertion order
        countryCityMap.put("China", "Beijing");
        countryCityMap.put("USA", "Washington DC");
        countryCityMap.put("India", "Delhi");  // Duplicate keys not allowed
        countryCityMap.put("SouthAfrica", "Delhi"); // values can be duplicate

        countryCityMap.put("India", "New Delhi"); // it will update the value of the key



        System.out.println("countryCityMap : " + countryCityMap);
    }
}
