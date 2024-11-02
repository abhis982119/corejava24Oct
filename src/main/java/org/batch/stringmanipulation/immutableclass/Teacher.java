package org.batch.stringmanipulation.immutableclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Teacher {


    private String name;

    private int    empid;


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", empid=" + empid +
                ", hashcode=" + hashCode() +
                '}';
    }
}
