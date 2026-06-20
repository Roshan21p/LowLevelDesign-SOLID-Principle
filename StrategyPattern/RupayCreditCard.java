package StrategyPattern;

public class RupayCreditCard extends CreditCard implements UPICompatibleCreditCard {

    private RefundStrategy refundStrategy;

    public RupayCreditCard() {
        // Default refund strategy can be set here
        this.refundStrategy = new SameInstrumentRefundStrategy();
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
    public void upiPayment() {
        // Implementation for UPI payment
        System.out.println("Making UPI payment with Rupay credit card");
    }

    @Override
    public void doRefund() {
        // Implementation for refund
        this.refundStrategy.doRefund();
    }
}
