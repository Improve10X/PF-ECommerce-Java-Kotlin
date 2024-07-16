package kotlinapp

import javaapp.Admin
import javaapp.UserInterface
import java.util.*

class AdminUi(private val admin: Admin) : UserInterface {
    override fun displayMenu() {
        println("\nAdmin Menu:")
        println("1. Add New Product")
        println("2. Update Product")
        println("3. Remove Product")
        println("4. View All Products")
        println("0. Back to Main Menu")
    }

    override fun handleUserInput() {
        val scanner = Scanner(System.`in`)
        print("Enter your choice: ")
        val choice = scanner.nextInt()
        when (choice) {
            1 -> admin.addNewProduct()
            2 -> admin.updateProduct()
            3 -> {
                print("Enter Product Id : ")
                val productId = scanner.nextLine()
                admin.removeProduct(productId)
            }
            4 -> admin.viewAllProducts()
            0 -> return
            else -> print("Invalid input. Please enter a number.")
        }
    }
}


