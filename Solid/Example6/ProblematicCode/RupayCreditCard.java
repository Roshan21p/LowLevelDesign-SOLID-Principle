package Solid.Example6.ProblematicCode;

public class RupayCreditCard extends CreditCard {
    
    @Override
    public void swipeAndPay() {
        System.out.println("Swiping Rupay credit card and making payment");
    }

    @Override
    public void doRefund() {
        // Implementation for refund
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

    // @Override
    // public void upiPayment() {
    //     // Implementation for UPI payment
    //     System.out.println("Making UPI payment with Rupay credit card");
    // }

    @Override
    public void intlPayment() {
        // Implementation for international payment
        System.out.println("Making international payment with Rupay credit card");
        throw new UnsupportedOperationException("Rupay credit card does not support international payments");
    }
    
}
