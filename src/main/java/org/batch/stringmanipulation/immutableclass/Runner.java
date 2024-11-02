package org.batch.stringmanipulation.immutableclass;


public class Runner {

/*
  1. private variables
  2. no setter methods
  3. final class, final variables
  4. return deep cloned objects from getter


 */
    public static void main(String[] args) {

       Teacher prashant = new Teacher("Prashant", 10001);

       Student student = new Student("Naresh", 101, prashant);

       System.out.println(student);

       Teacher teacher = student.getTeacher();
       teacher.setName("Pinky");

       System.out.println(student);

    }

}
