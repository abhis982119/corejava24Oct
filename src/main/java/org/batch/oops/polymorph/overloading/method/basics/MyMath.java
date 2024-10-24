package org.batch.oops.polymorph.overloading.method.basics;

public class MyMath {

     public int add (int a, int b){
          System.out.println("MyMath-add(int,int)");
         return a+b;
     }


     public int add (int a ){
          System.out.println("MyMath-add(int,int)");
          return a;
     }

     public int add (float a ){
          System.out.println("MyMath-add(int,int)");
          return 10;
     }







     public int add (){
          System.out.println("MyMath-add(int,int)");
          return 0;
     }












     public float add (float a, float b){
          System.out.println("MyMath-addFloat(float,float)");
          return a+b;
     }



}
