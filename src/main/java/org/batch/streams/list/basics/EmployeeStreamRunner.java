package org.batch.streams.list.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamRunner {

    public static void main(String[] args) {
        Employee ram  = Employee.builder().name("Ram").empId(1).department("TECHNOLOGY").salary(320000).build() ;
        Employee shayam  = Employee.builder().name("Shayam").empId(2).department("HR").salary(90000).build() ;
        Employee laxman  = Employee.builder().name("LAXMAN").empId(3).department("TECHNOLOGY").salary(600000).build() ;
        Employee bheem  = Employee.builder().name("Bheem").empId(4).department("SUPPORT").salary(30000).build() ;


        List<Employee> employees = new ArrayList<>();
        employees.add(ram);
        employees.add(shayam);
        employees.add(laxman);
        employees.add(bheem);

        System.out.println(employees);

        //We need employeelist from technology department
        List<Employee> technologyEmployee = employees.stream().filter(emp -> emp.getDepartment().equals("TECHNOLOGY")).collect(Collectors.toList());
        System.out.println("technologyEmployee : " + technologyEmployee);

        List<String> highValueEmployees = employees.stream().filter(employee -> employee.getDepartment().equals("TECHNOLOGY"))
                .filter(employee -> employee.getSalary() > 400000).map( employee -> employee.getName()).collect(Collectors.toList());
        System.out.println("highValueEmployees : " + highValueEmployees);

    }
}
