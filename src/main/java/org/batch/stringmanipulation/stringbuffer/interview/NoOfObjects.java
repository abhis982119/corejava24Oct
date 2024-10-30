package org.batch.stringmanipulation.stringbuffer.interview;

public class NoOfObjects {


    public static void main(String[] args) {
        String s1 = new String("abc");       // 1 // 1
       // StringBuffer s2 = new StringBuffer("abc");  // 1  //2
        StringBuffer s2 = new StringBuffer("abc");  // 1  //2
        String s3 = "abc";                          // 1  //3

        String s4 = s1.concat(s2.toString());       //1  //4
        String s5 = s1 + s3;                        //1  //5
        s2.append(s3);                              //0  //5



       // String s6 = s2.append(s3);               java: incompatible types: java.lang.StringBuffer cannot be converted to java.lang.String
        StringBuffer s7 = s2.append(s3);           //0   //5

        StringBuffer s8 = new StringBuffer("abc");  //1  //6

         String s9 = s1 + s2;                      //1 //7
    //     String s10 = s1.concat(s2);            //java: incompatible types: java.lang.StringBuffer cannot be converted to java.lang.String


    }
}
