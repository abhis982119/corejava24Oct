package org.batch.gofdesignpatter.behavioral.stategydesignpattern;

public class Runner {

    public static void main(String[] args) {
        /*
           Flight team
         */
    //    RazorPayCCPayment payment = new RazorPayCCPayment();
        //  PayUCCPayment payment = new PayUCCPayment();
        WorldPayCC payment = new WorldPayCC();

        PaymentHelper.doPayment(payment);

    }
}
