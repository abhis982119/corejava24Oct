package org.batch.specialkeywords.thiskeyword.variables;

public class Student {

    private String name ;  //instance variable



    public Student(String name){  // local variable
         this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
