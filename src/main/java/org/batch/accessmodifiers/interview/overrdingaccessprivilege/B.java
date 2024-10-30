package org.batch.accessmodifiers.interview.overrdingaccessprivilege;

public class B extends  A {

/*
    @Override
      void m1(){  //attempting to assign weaker access privileges; was public
        System.out.println("B-m1() : public ");
    }

*/

    @Override
    public void m2(){
        System.out.println("B-m2()  : default ");
    }

}
