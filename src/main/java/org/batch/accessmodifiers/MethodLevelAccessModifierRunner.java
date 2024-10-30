package org.batch.accessmodifiers;

import org.batch.accessmodifiers.model.A;

public class MethodLevelAccessModifierRunner {

    public static void main(String[] args) {
        A a = new A();
        a.m1();     //public
    //    a.m2();   // java: m2() has protected access in org.batch.accessmodifiers.model.A
   //     a.m3();   //cannot be accessed from outside package
   //    a.m4();    //java: m4() has private access in org.batch.accessmodifiers.model.A
    }
}
