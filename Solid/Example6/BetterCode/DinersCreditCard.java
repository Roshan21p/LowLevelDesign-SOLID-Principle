package Solid.Example6.BetterCode;

public class DinersCreditCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        System.out.println("Swiping Diners credit card and making payment");
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
}
