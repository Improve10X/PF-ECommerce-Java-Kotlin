package kotlinapp

class UpiPayment(private val upiId: String) {
    fun processPayment(amount: Float) {
        println("Processing UPI payment of $$amount using ID $upiId...")
    }
}

