package Solid.Example6.BetterCode;

public class RupayCreditCard extends CreditCard implements UPICompatibleCreditCard, RefundCompatibleCreditCard {

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
        System.out.println("Processing refund for Rupay credit card");
    }
}
