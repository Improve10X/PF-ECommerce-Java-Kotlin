package kotlinapp

import javaapp.ProductBrowser
import javaapp.ShoppingCart

class Customer(private val shoppingCart: ShoppingCart, private val productBrowser: ProductBrowser) {
    fun viewProductListing() {
        productBrowser.displayProducts()
    }

    fun viewProductDetails(productId: String?) {
        productBrowser.displayProductDetails(productId)
    }

    fun addToCart(productId: String?, quantity: Int) {
        val product = productBrowser.productCatalog.getProductById(productId)
        if (product != null) {
            shoppingCart.addItem(product, quantity)
            println(quantity.toString() + " " + product.name + " added to cart")
        } else {
            println("Product not found")
        }
    }

    fun removeFromCart(productId: String?) {
        val product = productBrowser.productCatalog.getProductById(productId)
        if (product != null) {
            shoppingCart.removeItem(product)
            println(product.name + " removed from cart")
        } else {
            println("Product not found")
        }
    }

    fun clearCart() {
        shoppingCart.clearCart()
    }

    fun checkout() {
        shoppingCart.displayCart()
    }
}


