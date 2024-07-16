package javaapp;

import java.util.Scanner;

public class AdminUi implements UserInterface{

    private Admin admin;

    public AdminUi(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void displayMenu() {
        System.out.println("\nAdmin Menu:");
        System.out.println("1. Add New Product");
        System.out.println("2. Update Product");
        System.out.println("3. Remove Product");
        System.out.println("4. View All Products");
        System.out.println("0. Back to Main Menu");
    }

    @Override
    public void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                admin.addNewProduct();
                break;
            case 2 :
                admin.updateProduct();
                break;
            case 3 :
                System.out.print("Enter Product Id : ");
                String productId = scanner.nextLine();
                admin.removeProduct(productId);
                break;
            case 4:
                admin.viewAllProducts();
                break;
            case 0:
                return;
            default:
                System.out.print("Invalid input. Please enter a number.");
                break;
        }
    }
}


