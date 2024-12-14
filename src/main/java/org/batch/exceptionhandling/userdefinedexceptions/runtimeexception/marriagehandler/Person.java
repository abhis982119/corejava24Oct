package org.batch.exceptionhandling.userdefinedexceptions.runtimeexception.marriagehandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Person {

    private String name;

    private Gender gender;

    private int age;
}
