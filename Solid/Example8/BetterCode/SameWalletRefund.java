package Solid.Example8.BetterCode;

public class SameWalletRefund implements RefundLogic {
    
    @Override
    public void doRefund() {
        System.out.println("Processing refund for SameWallet (Algo2)");
    }
}
