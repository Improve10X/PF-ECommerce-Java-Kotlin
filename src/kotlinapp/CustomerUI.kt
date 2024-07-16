package kotlinapp

import javaapp.Customer
import javaapp.UserInterface
import java.util.*

class CustomerUI(private val customer: Customer) : UserInterface {
    override fun displayMenu() {
        println("\nCustomer Menu:")
        println("1. View Product Listing")
        println("2. View Product Details")
        println("3. Add to Cart")
        println("4. Remove from Cart")
        println("5. Clear Cart")
        println("6. Checkout")
        println("0. Back to Main Menu")
    }

    private fun readProductIdFromUser(): String {
        val scanner = Scanner(System.`in`)
        print("Enter product id: ")
        val productId = scanner.nextLine()
        return productId
    }

    override fun handleUserInput() {
        val scanner = Scanner(System.`in`)
        println("Enter your choice: ")
        val choice = scanner.nextInt()

        when (choice) {
            1 -> customer.viewProductListing()
            2 -> customer.viewProductDetails(readProductIdFromUser())
            3 -> {
                print("enter product quantity : ")
                val quantity = scanner.nextInt()
                customer.addToCart(readProductIdFromUser(), quantity)
            }

            4 -> customer.removeFromCart(readProductIdFromUser())
            5 -> customer.clearCart()
            6 -> customer.checkout()
            0 -> return
            else -> println("Invalid choice.")
        }
    }
}


