package org.batch.stringmanipulation.immutableclass;



public final class Student implements Cloneable {


   private final String name;

   private final  int rollno;

   private final Teacher teacher;  //98989898


    public int getRollno() {
        return rollno;
    }



    public Teacher getTeacher() { //deep cloning
       return  new Teacher(teacher.getName(), teacher.getEmpid());
    }



    public String getName() {
        return name;
    }




    public Student(String name, int rollno, Teacher teacher) {
        this.name = name;
        this.rollno = rollno;
        this.teacher = teacher;
    }


    public void setTeacherName(String name){
        teacher.setName(name);
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", teacher=" + teacher +
                ", hashcode=" + hashCode() +
                '}';
    }
}
