package org.batch.collections.map.interviewquestions;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private String name;

    private int rollno;


    @Override
    public int hashCode() {
        return rollno;
    }

    @Override
    public boolean equals(Object obj) {
         if(obj == null) return false;

         if( ! (obj instanceof  Student) ){
             return false;
         }

         Student student = (Student) obj;

         return this.rollno == student.rollno;
    }
}
