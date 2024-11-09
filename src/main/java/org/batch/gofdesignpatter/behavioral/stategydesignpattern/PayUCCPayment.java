package org.batch.gofdesignpatter.behavioral.stategydesignpattern;

public class PayUCCPayment  extends CCPayment  {

    public void redirectToPaymentGateWayUrl(){
        System.out.println("Redirected user to payu url ");
    }

    public void confirmingPayment(){
        System.out.println("payment successful from payU");
    }

}
