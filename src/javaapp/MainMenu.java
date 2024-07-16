package javaapp;

import java.util.Scanner;

public class MainMenu {

    private ProductCatalog productCatalog;

    public MainMenu(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public void displayMainMenu() {
        System.out.println("\nMain Menu :");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("0. Exit");
    }

    public void handleMainMenuInput() {
        System.out.print("Enter your choice : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Admin admin = new Admin(productCatalog);
                AdminUi adminUi = new AdminUi(admin);
                while(true) {
                    adminUi.displayMenu();
                    adminUi.handleUserInput();
                }
            case 2:
                ShoppingCart shoppingCart = new ShoppingCart();
                ProductBrowser productBrowser = new ProductBrowser(productCatalog);
                Customer customer = new Customer(shoppingCart, productBrowser);
                CustomerUI customerUI = new CustomerUI(customer);
                while (true) {
                    customerUI.displayMenu();
                    customerUI.handleUserInput();
                }
            case 0:
                return;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
