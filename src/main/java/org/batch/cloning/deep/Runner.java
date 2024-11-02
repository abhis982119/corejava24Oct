package org.batch.cloning.deep;

import org.batch.cloning.Student;
import org.batch.cloning.Teacher;

public class Runner {


    public static void main(String[] args) {

        Teacher prashant = new Teacher("Prashant", 1000001);

        Student dikshita = new Student("Dikshita", 1,prashant);
        System.out.println(dikshita);

        Student shallowClonedDixita = dikshita.clone();  // shallow cloning
        Student deepClonedDixita = dikshita.deepClone();  // shallow cloning


        System.out.println(shallowClonedDixita);
        System.out.println(deepClonedDixita);
    }
}
