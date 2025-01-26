package org.batch.collections.list.basics.arraylist;

import org.batch.collections.model.Student;

import java.util.ArrayList;

public class ArraysVsCollectionRunner {


    public static void main(String[] args) {

        Student dikshita = Student.builder().name("Dikshita").rollNo(1).build();
        Student kishore = Student.builder().name("Kishore").rollNo(2).build();
        Student vinod = Student.builder().name("Vinod").rollNo(3).build();
        Student nikhila = Student.builder().name("Nikhila").rollNo(4).build();


        Student[] octJavaBatchStudents = new Student[4];
        octJavaBatchStudents[0] = dikshita;
        octJavaBatchStudents[1] = kishore;
        octJavaBatchStudents[2] = vinod;
        octJavaBatchStudents[3] = nikhila;


        System.out.println(" octJavaBatchStudents : " + octJavaBatchStudents);

/*
        for(int i = 0; i < octJavaBatchStudents.length; i++){
            System.out.println(octJavaBatchStudents[i]);
        }
*/

        System.out.println("Collection arraylist ....");

        ArrayList<Student> octJavaBatchStudentsList = new ArrayList<>();
        octJavaBatchStudentsList.add(dikshita);
        octJavaBatchStudentsList.add(kishore);
        octJavaBatchStudentsList.add(vinod);
        octJavaBatchStudentsList.add(nikhila);

        System.out.println("octJavaBatchStudentsList : " + octJavaBatchStudentsList);

    }
}
