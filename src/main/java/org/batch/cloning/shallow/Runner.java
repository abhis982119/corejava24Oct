package org.batch.cloning.shallow;

import org.batch.cloning.Student;
import org.batch.cloning.Teacher;

public class Runner extends Object{


    public static void main(String[] args) {

        Teacher prashant = new Teacher("Prashant", 1000001);

        Student dikshita = new Student("Dikshita", 1,prashant);
        System.out.println(dikshita);

        Student clonedDixita = dikshita.clone();  // shallow cloning
        System.out.println(clonedDixita);

    }
}
