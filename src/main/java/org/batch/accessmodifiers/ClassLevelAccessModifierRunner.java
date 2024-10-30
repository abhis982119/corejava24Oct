package org.batch.accessmodifiers;

//import org.batch.accessmodifiers.defaultmodifier.DefaultClass; // cannot be accessed from outside package
import org.batch.accessmodifiers.publicmodifier.PublicClass;

public class ClassLevelAccessModifierRunner {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.m1();

  /*      DefaultClass defaultClass = new DefaultClass(); // cannot be accessed from outside package
        defaultClass.m1();  */
    }
}
