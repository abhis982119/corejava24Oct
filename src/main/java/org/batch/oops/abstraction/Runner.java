package org.batch.oops.abstraction;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        String subject = "Abstraction Concept";
        String body = "Empty mail body ";
        List<String> emailIds = Arrays.asList("dikshita@gmail.com", "vinod@gmail.com");
        EmailHelper.sendEmail(subject, body, emailIds);

    }

}
