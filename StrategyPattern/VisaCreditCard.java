package StrategyPattern;

public class VisaCreditCard extends CreditCard implements RefundCompatibleCreditCard {

    private RefundStrategy refundStrategy;

    public VisaCreditCard() {
        // Default refund strategy can be set here
        this.refundStrategy = new BankAccountRefundStrategy();
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
        // Implementation for refund
        this.refundStrategy.doRefund();
    }
}
