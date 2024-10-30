package org.batch.finalkeyword.variables;

public class Runner {


    public static void main(String[] args) {
        System.out.println(A.companyName);

        //  A.companyName = "Tomato";  //java: cannot assign a value to final variable companyName

        System.out.println(A.companyName);
    }
}
