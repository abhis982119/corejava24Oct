package org.batch.collections.sorting.list.comparable.basic;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*
     -ve  :  emp1 should come before emp2
     0   : is equal
     +ve :  emp2 should come after emp2


 */
@Getter
@Setter
@Builder
@ToString
public class Employee  implements Comparable<Employee>{

    private String name;

    private int empId;

    @Override
    public int compareTo(Employee emp2) {
       //  return empId - emp2.getEmpId(); //asc order of empId
         return emp2.getEmpId() - empId ; //asc order of empId
    }
}
