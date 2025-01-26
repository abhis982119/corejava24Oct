package org.batch.collections.map.interviewquestions;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SetWithWrapper {

    public static void main(String[] args) {
        Set<Integer>  values = new HashSet<>();
        values.add(1);
        values.add(1);
        values.add(2);
        values.add(3);

        System.out.println(values);


        Student dikshita = Student.builder().name("Dikshita").rollno(1).build();
        Student duplicateDikshita = Student.builder().name("Dikshita").rollno(1).build();
        Student kishore = Student.builder().name("Kishore").rollno(2).build();
        Student vinod = Student.builder().name("Vinod").rollno(3).build();

        Set<Student> students = new HashSet<>();
        students.add(dikshita);
        students.add(duplicateDikshita);
        students.add(kishore);
        students.add(vinod);

        System.out.println(students);




    }
}
