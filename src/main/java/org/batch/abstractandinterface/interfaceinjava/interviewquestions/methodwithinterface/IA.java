package org.batch.abstractandinterface.interfaceinjava.interviewquestions.methodwithinterface;

/*
 Context Area
 -------------------
  instance method and static method

 Access modifiers:
----------------------
 public >  protected   >  default >  private

  */
public interface IA {



      void m1(); //    public abstract

       default void m2(){     // 1.8 version of java
            System.out.println("IA-m2()");
        }


        /*
          public void m3(){   //public method cannot have a body in interface
            System.out.println("IA-m2()");

        }*/


 /*      protected void m3(){   //protected concrete method cannot have a body in interface
        System.out.println("IA-m2()");

      }*/




       private void m3(){
           System.out.println("IA-m3()");
       }


       public static void m4(){
           System.out.println("IA-m4()");
       }

}
