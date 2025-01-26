package org.batch.collections.sorting.list.comparable.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortingRunner {

    public static void main(String[] args) {
        Employee shayam = Employee.builder().empId(1).name("Shayam").build();

        Employee ram = Employee.builder().empId(2).name("Ram").build();
        Employee laxman = Employee.builder().empId(3).name("Laxman").build();


        List<Employee> employees = new ArrayList<>();
        employees.add(ram);
        employees.add(laxman);
        employees.add(shayam);

        System.out.println("Before sorting ");
        System.out.println(employees);

        Collections.sort(employees);

        System.out.println("After sorting ");
        System.out.println(employees);


    }
}
