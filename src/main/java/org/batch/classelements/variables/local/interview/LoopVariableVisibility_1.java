package org.batch.classelements.variables.local.interview;

public class LoopVariableVisibility_1 {

    public static void main(String[] args) {
        int i = 0;
        for( ; i < 5  ;  i++ ){
            System.out.println(i);
        }


       // int i = 0;    //variable i is already defined in method main(java.lang.String[])
        for( ; i < 5  ;  i++ ){
            System.out.println(i);
        }

      /*
        for(declaration + initialization ; condition_check  ; post_loop_operation ){

        }
        */

    }
}
