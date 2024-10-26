package org.batch.classnobject.memorymanagement;

public class Runner {
    /*
      1. Stack  : x
      2. Heap
      3. Non-heap  : x
     */
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }


 /*
 -------------                                                              --------------
 STACK                                                                          HEAP
 -------------                         ----------                          ---------------
 main                                      m1
 --------------                        -----------                               67878997
  args[]                                 localVariable = 0                    A{instanceVariable = 0 }
  A a = 67878997;

 --------------                         --------------
                            <----------  main() : 11:
 ------------                           --------------

 -----------                            --------------




 */

}
