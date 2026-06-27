package Solid.Example8.BetterCode;

public class SameInstrumentRefund implements RefundLogic {
    
    @Override
    public void doRefund() {
        System.out.println("Processing refund for SameInstrumentRefund (Algo1)");
    }
}
