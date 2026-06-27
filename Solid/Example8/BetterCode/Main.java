package Solid.Example8.BetterCode;

public class Main {
    
    public static void main(String[] args) {
        
        CreditCard cc1 = new AmexCreditCard(new SameWalletRefund());
        
        CreditCard cc2 = new VisaCreditCard(new SameInstrumentRefund());

    }
}
