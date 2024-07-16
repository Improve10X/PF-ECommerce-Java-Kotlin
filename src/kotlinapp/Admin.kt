package kotlinapp

import java.util.*

class Admin(
    private val productCatalog: ProductCatalog
) {
    fun addNewProduct() {
        print("Enter product name: ")
        val scanner = Scanner(System.`in`)
        val name = scanner.nextLine()
        print("Enter product price : ")
        val price = scanner.nextFloat()
        print("Enter discount percentage : ")
        val discountPercentage = scanner.nextInt()
        val product = Product(name, price, discountPercentage)
        productCatalog.products.add(product)
        print("Product added successfully!")
    }

    fun updateProduct() {
        val scanner = Scanner(System.`in`)
        val product = getProductFromUser()
        if(product != null) {
            print("Enter new price : ")
            val newPrice = scanner.nextFloat()
            product.price = newPrice
            print("Enter new discount percentage : ")
            val newDiscountPercentage = scanner.nextInt()
            product.discountPercentage = newDiscountPercentage
            println("Product updated Successfully!")
        } else {
            print("Product not found")
        }
    }

    private fun getProductFromUser(): Product {
        val scanner = Scanner(System.`in`)
        print("Enter product name to update : ")
        val productId = scanner.nextLine();
        val product = productCatalog.getProductById(productId)
        return product
    }

    fun removeProduct(productId: String) {
        val product = getProductFromUser()
        if(product != null) {
            productCatalog.products.remove(product)
            print("Product removed successfully!")
        } else {
            print("Product not found")
        }
    }

    fun viewAllProducts() {
        productCatalog.products.forEach { product ->
            print("${product.name} - ${product.price} - ${product.discountPercentage}")
        }
    }
}


