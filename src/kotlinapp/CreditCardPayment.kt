package kotlinapp

class CreditCardPayment(private val cardNumber: String, private val expiryDate: String, private val cvv: String) {
    fun processPayment(amount: Float) {
        print("Processing credit card payment of $$amount")
    }
}

