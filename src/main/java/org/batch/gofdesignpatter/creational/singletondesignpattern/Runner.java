package org.batch.gofdesignpatter.creational.singletondesignpattern;

import org.batch.cloning.Student;

public class Runner {


    public static void main(String[] args) {
        EntityManager entityManager =  EntityManager.getInstance();
        EntityManager entityManager1 =  EntityManager.getInstance();

        System.out.println(entityManager);
        System.out.println(entityManager1);
    }

}
