package Solid.Example8.ProblematicCode;

public class VisaCreditCard extends CreditCard implements RefundCompatibleCreditCard {

    public SameInstrumentRefund refundAlgorithm;

    public VisaCreditCard() {
        this.refundAlgorithm = new SameInstrumentRefund();
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swiping Visa credit card and making payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
        System.out.println("Tapping Visa credit card and making payment");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
        System.out.println("Making online payment with Visa credit card");
    }

    @Override
    public void doRefund() {
        refundAlgorithm.doRefund();
    }

}
