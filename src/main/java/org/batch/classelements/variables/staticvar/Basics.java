package org.batch.classelements.variables.staticvar;

/*

---------------------------------------------
Static-variable
---------------------------------------------
scope of variable
size of a variable (including range)
default values                                 : Yes
language memory name (logical memory name)     : Non-heap memory
hardware memory name                           : RAM
memory management ( occupied and free )        : During .class file loading, During .class file un-loading
access the variable                            : Direct access within the class, reference-variable, DirectAccess with className

*/
public class Basics {

    static int staticInteger = 20;   //static-variable

    public void m1(){
        System.out.println("staticInteger default value : " + staticInteger);
    }

}
