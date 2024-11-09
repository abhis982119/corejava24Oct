package org.batch.gofdesignpatter.behavioral.stategydesignpattern;

public class RazorPayCCPayment extends CCPayment {


    public void redirectToPaymentGateWayUrl(){
        System.out.println("Redirected user to razorpay url ");
    }

    public void confirmingPayment(){
        System.out.println("payment successful");
    }
}
