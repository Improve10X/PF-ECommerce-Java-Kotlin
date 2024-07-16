package javaapp;

public class DebitCardPayment {

    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public DebitCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void processPayment(float amount) {
        System.out.print("Processing debit card payment of $" + amount);
    }
}

