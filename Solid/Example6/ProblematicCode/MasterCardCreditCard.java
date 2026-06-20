package Solid.Example6.ProblematicCode;

public class MasterCardCreditCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        System.out.println("Swiping MasterCard credit card and making payment");
    }

    @Override
    public void doRefund() {
        // Implementation for refund
        System.out.println("Processing refund for MasterCard credit card");
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

    // @Override
    // public void upiPayment() {
    //     // Implementation for UPI payment
    //     System.out.println("Making UPI payment with MasterCard credit card");
    // }

    @Override
    public void intlPayment() { 
        // Implementation for international payment
        System.out.println("Making international payment with MasterCard credit card");
    }
}
