package org.batch.cloning;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Student  implements Cloneable{


    private String name;

    private int rollno;

    private Teacher teacher;



    @SneakyThrows
    public Student clone(){
        return  (Student) super.clone();
    }


    /*

    Shallow Cloning
    ------------------

      sheep1
                             ----> MotherSheep (name = "crow")
      clonedSheep


      Deep Cloning
      -------------

            sheep1          ----> MotherSheep

            clonedSheep     ----> ClonedMotherSheep


     */


    @SneakyThrows
    public Student deepClone(){
        Student clonedStudent =   (Student) super.clone();
        Teacher clonedTeacher = new Teacher(teacher.getName(), teacher.getEmpid());
        clonedStudent.setTeacher(clonedTeacher);
        return clonedStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", hashcode=" + hashCode() +
                ", teacher=" + teacher +
                '}';
    }
}
