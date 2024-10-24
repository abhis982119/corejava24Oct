package org.batch.oops.abstraction;

import java.util.List;

public class EmailHelper {

    public static void sendEmail(String subject, String body, List<String> emailIds){
        System.out.println("Sending email to " + emailIds + " with subject " + subject);
    }
}
