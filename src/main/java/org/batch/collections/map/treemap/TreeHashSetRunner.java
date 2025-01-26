package org.batch.collections.map.treemap;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeHashSetRunner extends  Object{

    public static void main(String[] args) {
        Map<String, String> countryCityMap = new TreeMap();
        countryCityMap.put("India", "Delhi");   //  support insertion order
        countryCityMap.put("China", "Beijing");
        countryCityMap.put("USA", "Washington DC");
        countryCityMap.put("India", "Delhi");  // Duplicate keys not allowed
        countryCityMap.put("SouthAfrica", "Delhi"); // values can be duplicate

        countryCityMap.put("India", "New Delhi"); // it will update the value of the key
     //   countryCityMap.put("null", "New Delhi"); // null values not allowed as key
        countryCityMap.put("Random", null); // null values are allowed

        System.out.println("countryCityMap : " + countryCityMap);


        System.out.println("countryCityMap.get(India) : " +  countryCityMap.get("India"));


    }
}
