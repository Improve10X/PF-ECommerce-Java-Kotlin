package kotlinapp

class DebitCardPayment(private val cardNumber: String, private val expiryDate: String, private val cvv: String) {
    fun processPayment(amount: Float) {
        print("Processing debit card payment of $$amount")
    }
}

