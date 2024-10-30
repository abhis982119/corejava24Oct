package org.batch.accessmodifiers.defaultmodifier;

import org.batch.accessmodifiers.publicmodifier.PublicClass;

public class Runner {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.m1();

        DefaultClass defaultClass = new DefaultClass();
        defaultClass.m1();
    }
}
