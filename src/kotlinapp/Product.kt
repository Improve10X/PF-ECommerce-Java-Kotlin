package kotlinapp

data class Product(
    val name: String,
    val price: Float,
    val discountPercentage: Int
) {

    fun calculateDiscount(): Float {
        return price * (discountPercentage / 100.0f)
    }
}