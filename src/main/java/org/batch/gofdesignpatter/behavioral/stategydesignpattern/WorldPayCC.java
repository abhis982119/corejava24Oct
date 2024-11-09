package org.batch.gofdesignpatter.behavioral.stategydesignpattern;

public class WorldPayCC extends CCPayment{
    @Override
    public void redirectToPaymentGateWayUrl() {
        System.out.println("Redirected to worldpaycc site");
    }

    @Override
    public void confirmingPayment() {
        System.out.println("payment confirmed from worldpaycc ");
    }
}
