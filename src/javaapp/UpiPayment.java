package javaapp;

public class UpiPayment {
    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    public void processPayment(float amount) {
        System.out.println("Processing UPI payment of $" + amount + " using ID "+upiId+"...");
    }
}
