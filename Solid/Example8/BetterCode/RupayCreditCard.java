package Solid.Example8.BetterCode;

public class RupayCreditCard extends CreditCard implements RefundCompatibleCreditCard {

    public RefundLogic refundAlgorithm;

    public RupayCreditCard(RefundLogic refundAlgorithm) {
        this.refundAlgorithm = refundAlgorithm;
    }
    
    @Override
    public void swipeAndPay() {
        System.out.println("Swiping Rupay credit card and making payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
        System.out.println("Tapping Rupay credit card and making payment");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
        System.out.println("Making online payment with Rupay credit card");
    }

    @Override
    public void doRefund() {
        refundAlgorithm.doRefund();
    }

}
