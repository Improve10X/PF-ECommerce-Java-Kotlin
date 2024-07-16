package kotlinapp

import javaapp.*
import javaapp.Admin
import javaapp.AdminUi
import javaapp.Customer
import javaapp.CustomerUI
import javaapp.ProductBrowser
import javaapp.ProductCatalog
import java.util.*

class MainMenu(private val productCatalog: ProductCatalog) {
    fun displayMainMenu() {
        println("\nMain Menu :")
        println("1. Admin")
        println("2. Customer")
        println("0. Exit")
    }

    fun handleMainMenuInput() {
        print("Enter your choice : ")
        val scanner = Scanner(System.`in`)
        val choice = scanner.nextInt()
        when (choice) {
            1 -> {
                val admin = Admin(productCatalog)
                val adminUi = AdminUi(admin)
                while (true) {
                    adminUi.displayMenu()
                    adminUi.handleUserInput()
                }
                val shoppingCart = ShoppingCart()
                val productBrowser = ProductBrowser(productCatalog)
                val customer = Customer(shoppingCart, productBrowser)
                val customerUI = CustomerUI(customer)
                while (true) {
                    customerUI.displayMenu()
                    customerUI.handleUserInput()
                }
                return
            }

            2 -> {
                val shoppingCart = ShoppingCart()
                val productBrowser = ProductBrowser(productCatalog)
                val customer = Customer(shoppingCart, productBrowser)
                val customerUI = CustomerUI(customer)
                while (true) {
                    customerUI.displayMenu()
                    customerUI.handleUserInput()
                }
                return
            }

            0 -> return
            else -> println("Invalid choice")
        }
    }
}


