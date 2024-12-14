package org.batch.exceptionhandling.userdefinedexceptions.runtimeexception.marriagehandler;

public class MarriageRegistration {


    public static boolean registerMarriage(Person male, Person female){

        if(female.getAge() < 18){
          throw new FemaleUnderAgeException("Female Underage : Legal age to regsiter marriage is 18 ");

        }

        if(male.getAge() < 21){
            throw new MaleUnderAgeException("Male Underage : Legal age to regsiter marriage is 21");
        }

        System.out.println(male.getName() + " and " + female.getName() + " marriage has been successfully registered");

        return true;
    }

}
