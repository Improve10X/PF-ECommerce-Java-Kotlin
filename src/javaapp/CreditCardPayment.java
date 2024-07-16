package javaapp;

public class CreditCardPayment {

    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void processPayment(float amount) {
        System.out.print("Processing credit card payment of $" + amount);
    }
}


