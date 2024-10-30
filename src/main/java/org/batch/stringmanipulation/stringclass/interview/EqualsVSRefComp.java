package org.batch.stringmanipulation.stringclass.interview;

public class EqualsVSRefComp extends Object {

    /*
     ==               :  reference comparision ( check memory address )

     Object .equals() : reference comparision

     String .equals() : compares the content


     */

    public static void main(String[] args) {

        String s1 = new String("abc");   // heap     // 1
        String s2 = "abc";                     // scp       // 1

        String s3 = new String("ABC");  // heap     // 1
        String s4 = "ABC";

        String s5 = "abc";                                // 0


        if(s1.equals(s2)){
            System.out.println("s1.equals(s2)"); // check
        }else{
            System.out.println("!s1.equals(s2)");
        }

        if(s1 == s2 ){
            System.out.println("s1 == s2 ");
        }else{
            System.out.println("!s1 == s2 "); // check
        }



        if(s1.equals(s3)){
            System.out.println("s1.equals(s3)");
        }else{
            System.out.println("!s1.equals(s3)"); //check
        }

        if(s1 == s3 ){
            System.out.println("s1 == s3 ");
        }else{
            System.out.println("!s1 == s3 )");  //check
        }


        if(s2.equals(s5)){
            System.out.println("s2.equals(s5)");  //check
        }else{
            System.out.println("!s2.equals(s5)");
        }

        if(s2 == s5 ){
            System.out.println("s2 == s5 ");    //check
        }else{
            System.out.println("!s2 == s5)");
        }

    }
}
