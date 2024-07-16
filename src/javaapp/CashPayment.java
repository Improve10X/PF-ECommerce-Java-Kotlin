package javaapp;

public class CashPayment {

    private float amountPaid;

    public CashPayment(float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public void processPayment(float amount) {
        System.out.println("Processing cash payment of $"+amount);
        if(amountPaid >= amount) {
            System.out.print("Payment successful! Change:" + (amountPaid - amount));
        } else {
            System.out.print("Insufficient cash. Payment failed.");
        }
    }
}

