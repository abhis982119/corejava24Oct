package org.batch.streams.list.basics;

import org.batch.garbagecollection.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsRunner {


    public static void main(String[] args) {
        List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        //Filter odd numbers
        System.out.println("numbers : " + numbers);
        List<Integer> evenNumbers =  numbers.stream().filter(value -> value%2 == 0).collect(Collectors.toList());
        System.out.println("evenNumbers : " + evenNumbers);




        List<String> names = Arrays.asList("dikshita","kishore","vinod");
        System.out.println(names);
        List<String> uppercaseNames = names.stream().map(name -> name.toUpperCase() ).collect(Collectors.toList());;
        System.out.println(uppercaseNames);


        //Filter odd numbers
        System.out.println("numbers : " + numbers);
        List<Integer> evenNumbersMultipliedBy10 =  numbers.stream().filter(value -> value%2 == 0).map(evenNumber -> evenNumber*10).collect(Collectors.toList());
        System.out.println("evenNumbersMultipliedBy10 : " + evenNumbersMultipliedBy10);



        //Sorting
        List<Integer> unsortedList = Arrays.asList(1,3,2,4,5);
        System.out.println("unsortedList : " + unsortedList);

        List<Integer> sortedList = unsortedList.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedList : " + sortedList);


        //Distinct
         List<Integer> duplicates = Arrays.asList(1,1,2,3,3,4,5,5,5);
        System.out.println("duplicates : " + duplicates);
        List<Integer> distinctValues = duplicates.stream().distinct().collect(Collectors.toList());
        System.out.println("distinctValues : " + distinctValues);



        //Find operations

       int value =  List.of(1,2,5,4,6).stream().filter(val ->   val > 2).findFirst().get();
        System.out.println("first value greater than 2 : " + value);

    }
}
