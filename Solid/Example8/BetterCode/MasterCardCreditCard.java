package Solid.Example8.BetterCode;

public class MasterCardCreditCard extends CreditCard implements RefundCompatibleCreditCard {

    public RefundLogic refundAlgorithm;

    public MasterCardCreditCard(RefundLogic refundAlgorithm) {
        this.refundAlgorithm = refundAlgorithm;
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
        refundAlgorithm.doRefund();
    }
}
