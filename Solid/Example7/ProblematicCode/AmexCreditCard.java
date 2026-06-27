package Solid.Example7.ProblematicCode;

public class AmexCreditCard extends CreditCard implements RefundCompatibleCreditCard {

    public RefundAlgorithm refundAlgorithm;

    public AmexCreditCard() {
        this.refundAlgorithm = new RefundAlgorithm();
    }
    
    @Override
    public void swipeAndPay() {
        System.out.println("Swiping Amex credit card and making payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
        System.out.println("Tapping Amex credit card and making payment");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
        System.out.println("Making online payment with Amex credit card");
    }

    @Override
    public void doRefund() {
        refundAlgorithm.Algo2();
    }

}