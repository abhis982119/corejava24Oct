package org.batch.classelements.variables.local.interview;

public class LoopVariableVisibility_2 {


    public static void main(String[] args) {

   //   int i = 50;

      for(int i = 0; i < 5; i++){
            System.out.println(i);
        }


       for(int i = 0; i < 5; i++){
            System.out.println(i);
        }


        int i = 50;
        System.out.println(i);



    }
}
