package Solid.Example6.ProblematicCode;

public class DinersCreditCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        System.out.println("Swiping Diners credit card and making payment");
    }

    @Override
    public void doRefund() {
        // Implementation for refund
        System.out.println("Processing refund for Diners credit card");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
        System.out.println("Tapping Diners credit card and making payment");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
        System.out.println("Making online payment with Diners credit card");
    }

    // Diners credit card does not support UPI payment, so we can leave this method
    // unimplemented or throw an exception
    // @Override
    // public void upiPayment() {
    // // Implementation for UPI payment
    // System.out.println("Making UPI payment with Diners credit card");
    // }

    @Override
    public void intlPayment() {
        // Implementation for international payment
        System.out.println("Making international payment with Diners credit card");
    }
}
