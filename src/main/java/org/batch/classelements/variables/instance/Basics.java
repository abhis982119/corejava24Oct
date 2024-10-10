package org.batch.classelements.variables.instance;

/*
---------------------------------------------
Instance-Variable
---------------------------------------------
scope of variable
size of a variable (including range)
default values                                 : Yes
language memory name (logical memory name)     : heap memory
hardware memory name                           : RAM
memory management ( occupied and free )        : Object is created, Object is destroyed
access the variable
*/
public class Basics {

    byte bytevalue;
    short shorvalue;

    int integer ;  // instance-variable
    long longvalue ;

    float floatValue;
    double doubleValue;

    boolean defaultBoolean;

    char defaultChar;



    public void m1(){
        System.out.println(bytevalue);
        System.out.println(shorvalue);
        System.out.println(integer);
        System.out.println(longvalue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(defaultBoolean);
        System.out.println(defaultChar);

    }

}
