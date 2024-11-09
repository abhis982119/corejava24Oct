package org.batch.gofdesignpatter.behavioral.stategydesignpattern;

public abstract class CCPayment  implements IPayment{

    @Override
    public final void doPayment() {
        getCCDetails();
        redirectToPaymentGateWayUrl();
        confirmingPayment();
    }

    public void getCCDetails(){
        System.out.println("CC details fetched");
    }


    public abstract void redirectToPaymentGateWayUrl();


    public abstract void confirmingPayment() ;


}
