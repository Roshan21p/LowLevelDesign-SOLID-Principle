package StrategyPattern;

public class MasterCardCreditCard extends CreditCard implements RefundCompatibleCreditCard {

    private RefundStrategy refundStrategy;

    // public MasterCardCreditCard(RefundStrategy refundStrategy) {
    //     this.refundStrategy = refundStrategy;
    // }

    public MasterCardCreditCard() {
        // Default refund strategy can be set here
        this.refundStrategy = new BankAccountRefundStrategy();
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swiping MasterCard credit card and making payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
        System.out.println("Tapping MasterCard credit card and making payment");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
        System.out.println("Making online payment with MasterCard credit card");
    }

    @Override
    public void doRefund() {
        // Implementation for refund
        this.refundStrategy.doRefund();
    }
}
