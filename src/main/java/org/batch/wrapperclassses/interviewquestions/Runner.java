package org.batch.wrapperclassses.interviewquestions;

public class Runner {

    public static void main(String[] args) {
        AutoBoxingAndUnboxing autoBoxingAndUnboxing = new AutoBoxingAndUnboxing();
        int a = 1;
        int b = 2;
        Integer c = Integer.valueOf(1);
        Integer d = Integer.valueOf(4);

        autoBoxingAndUnboxing.add(a,b);  //autoboxing

        autoBoxingAndUnboxing.add(c,d);
        autoBoxingAndUnboxing.add(a,d);

        autoBoxingAndUnboxing.multiply(c,d); //auto-unboxing


        if(a == c){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }




        if(c.equals(a)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
/*

       if(a.equals(c)){   //java: int cannot be dereferenced
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
*/


        Integer c1 = new Integer(10);
        Integer c2 = new Integer(10);

        if(c1 == c2){
            System.out.println("both objects int same");
        }else{
            System.out.println("both int objects different");
        }

        Integer c3 = 127;
        Integer c4 = 127;

        Integer c5 = 300000;
        Integer c6 = 300000;

        if(c3 == c4){
            System.out.println("both primitive int same");
        }else{
            System.out.println("both primitive int different");
        }


        if(c5 == c6){
            System.out.println("both primitive int same");
        }else{
            System.out.println("both primitive int different");
        }

    }
}
