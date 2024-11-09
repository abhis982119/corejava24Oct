package org.batch.gofdesignpatter.behavioral.stategydesignpattern;

public class PaymentHelper {

    public static void doPayment(IPayment payment){
        payment.doPayment();
    }

}
