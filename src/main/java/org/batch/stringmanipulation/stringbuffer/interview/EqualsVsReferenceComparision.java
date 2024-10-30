package org.batch.stringmanipulation.stringbuffer.interview;

public class EqualsVsReferenceComparision {


    public static void main(String[] args) {

        String s1 = new String("abc");  //heap
        String s2 = "abc";                      //scp
        StringBuffer s3 = new StringBuffer("abc");



        if(s1.equals(s2)){
            System.out.println("s1.equals(s2))");  // check
        }else{
            System.out.println("!s1.equals(s2))");
        }

        if(s1 == s2){
            System.out.println(" s1 == s2 ");
        }else{
            System.out.println("!s1 == s2");  //check
        }




        if(s1.equals(s3)){
            System.out.println("s1.equals(s3))");
        }else{
            System.out.println("!s1.equals(s3))");  //check
        }


/*

        if(s1 == s3){            //java: incomparable types: java.lang.String and java.lang.StringBuffer
            System.out.println(" s1 == s3 ");
        }else{
            System.out.println("!s1 == s3");  // check
        }


*/

        if(s3.equals(s1)){
            System.out.println("s3.equals(s1))");
        }else{
            System.out.println("!s3.equals(s1))"); //check
        }

/*

        if(s3 == s1){  //java: incomparable types: java.lang.StringBuffer and java.lang.String
            System.out.println(" s3 == s1 ");
        }else{
            System.out.println("!s3 == s1");  //check
        }

*/

    }
}
