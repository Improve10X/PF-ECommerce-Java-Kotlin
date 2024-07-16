package kotlinapp

data class Product(
    val name: String,
    var price: Float,
    var discountPercentage: Int
) {

    fun calculateDiscount(): Float {
        return price * (discountPercentage / 100.0f)
    }
}