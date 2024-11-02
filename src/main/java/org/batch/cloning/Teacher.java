package org.batch.cloning;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Teacher {


      String name;

      int    empid;


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", empid=" + empid +
                ", hashcode=" + hashCode() +
                '}';
    }
}
