package org.batch.collections.sorting.list.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortingRunner {

    public static void main(String[] args) {
        Student dikshita = Student.builder().name("Dikshita").rollno(4).build();
        Student kishore = Student.builder().name("Kishore").rollno(3).build();
        Student vinod = Student.builder().name("Vinod ").rollno(2).build();


        List<Student> students = new ArrayList<>();
        students.add(kishore);
        students.add(dikshita);
        students.add(vinod);


        System.out.println("Before sorting");
        System.out.println(students);


        Collections.sort(students, new StudentRollNumberComparator());

        System.out.println("After sorting with rollNumber");
        System.out.println(students);

        Collections.sort(students, new StudentNameComparator());
        System.out.println("After sorting with name");
        System.out.println(students);




    }
}
