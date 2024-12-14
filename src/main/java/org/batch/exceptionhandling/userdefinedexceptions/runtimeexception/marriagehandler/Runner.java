package org.batch.exceptionhandling.userdefinedexceptions.runtimeexception.marriagehandler;

import java.sql.SQLOutput;

public class Runner {


    public static void main(String[] args) {
        Person rahul = new Person("Rahul", Gender.MALE, 21);
        Person preet = new Person("Preet", Gender.FEMALE, 17);
        MarriageRegistration.registerMarriage(rahul, preet);

    }
}
