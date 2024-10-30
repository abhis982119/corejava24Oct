package org.batch.stringmanipulation.stringclass.interview;

public class NoOfObjects {


    public static void main(String[] args) {
        String s1 = new String("abc");  // 1    // 1
        String s2 = "abc";                     // 1   // 2

        String s3 = new String("ABC");   //1      //3

        String s4 = "abc";                      //0      //3

        String s5 = s2.concat(s3);              //1      //4

        String s6 = s1.substring(1);  //1     //5

        String s7 = s5 + s4;                   //1      //6

        String s8 = s1.concat("def");         // 1     //7
        String s9 = new String("abcdef"); //1      //8

    }
}
