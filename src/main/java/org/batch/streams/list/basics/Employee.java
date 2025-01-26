package org.batch.streams.list.basics;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Employee {

    private int empId;

    private String name;

    private int salary;

    private String department;
}
