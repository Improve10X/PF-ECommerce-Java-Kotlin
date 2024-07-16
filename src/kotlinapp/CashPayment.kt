package kotlinapp

class CashPayment(private val amountPaid: Float) {
    fun processPayment(amount: Float) {
        println("Processing cash payment of $$amount")
        if (amountPaid >= amount) {
            print("Payment successful! Change:" + (amountPaid - amount))
        } else {
            print("Insufficient cash. Payment failed.")
        }
    }
}

