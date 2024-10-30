package org.batch.accessmodifiers;

class Notes {


    protected int a  = 10;


  /*

   public     : Accessible from any package
   proctected : within the package, but also outside the package but within child classes
   default    : within the package
   private    : within the class



                    Class                                       Method
   public            Yes                                         Yes
   protected         No                                          Yes
   default           Yes(no need to explicit mention)            Yes (No need to explicit mention for class, but need explicit mention for Interface
   private           No                                          Yes



  Access-Privilege :
  -------------------

  public > protected > default > private



  We cannot a weaker access privilege while overriding the method, while other way around is allowed

  */
}
