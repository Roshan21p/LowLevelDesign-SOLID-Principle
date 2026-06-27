package Solid.Example7.BetterCode;

public abstract class CreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    protected String getCardNumber() {
        // Implementation to get card number
        return cardNumber;
    }

    protected String getCardHolderName() {
        // Implementation to get card holder name
        return cardHolderName;
    }

    protected String getExpiryDate() {
        // Implementation to get expiry date
        return expiryDate;
    }

    protected String getCvv() {
        // Implementation to get CVV
        return cvv;
    }

    protected void setCardNumber(String cardNumber) {
        // Implementation to set card number
        this.cardNumber = cardNumber;
    }

    protected void setCardHolderName(String cardHolderName) {
        // Implementation to set card holder name
        this.cardHolderName = cardHolderName;
    }

    protected void setExpiryDate(String expiryDate) {
        // Implementation to set expiry date
        this.expiryDate = expiryDate;
    }

    protected void setCvv(String cvv) {
        // Implementation to set CVV
        this.cvv = cvv;
    }

    public abstract void swipeAndPay();

    public abstract void tapAndPay();

    public abstract void onlinePayment();
}
