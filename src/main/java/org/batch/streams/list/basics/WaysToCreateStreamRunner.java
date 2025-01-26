package org.batch.streams.list.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class WaysToCreateStreamRunner {


    public static void main(String[] args) {


        //COLLECTION TO STREAM
        Arrays.asList(1,2,3).stream().forEach(value -> System.out.print(value + ", "));
        System.out.println();
        List.of(1,2,3).stream().forEach(value -> System.out.print(value + ", "));

        System.out.println();
        new HashSet<Integer>(Arrays.asList(1,2,3)).stream().forEach(value -> System.out.print(value + " , "));


        //primitive array
        System.out.println();
        System.out.println("Primitive array to stream");
        int[] arr = new int[]{1,2,3};
        Arrays.stream(arr).forEach(value -> System.out.print(value + ", "));

        //Directly using stream
        System.out.println();
        System.out.println("Stream object direct instantiation ");
        Stream.of(1,2,3).forEach(value -> System.out.print(value + ", "));

    }
}
