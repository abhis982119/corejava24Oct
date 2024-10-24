package org.batch.oops.encapsulation;

public class Student {



    private String name;
    private int rollNo;




    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }



    public void m1( int pincode ){
        System.out.println(name + " :  address pincode  "  + pincode);
    }




    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
