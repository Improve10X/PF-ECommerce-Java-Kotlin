package javaapp;

import java.util.Scanner;

public class CustomerUI implements UserInterface {

    private Customer customer;

    public CustomerUI(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void displayMenu() {
        System.out.println("\nCustomer Menu:");
        System.out.println("1. View Product Listing");
        System.out.println("2. View Product Details");
        System.out.println("3. Add to Cart");
        System.out.println("4. Remove from Cart");
        System.out.println("5. Clear Cart");
        System.out.println("6. Checkout");
        System.out.println("0. Back to Main Menu");
    }

    private String readProductIdFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product id: ");
        String productId = scanner.nextLine();
        return productId;
    }

    @Override
    public void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                customer.viewProductListing();
                break;
            case 2 :
                customer.viewProductDetails(readProductIdFromUser());
                break;
            case 3:
                System.out.print("enter product quantity : ");
                int quantity = scanner.nextInt();
                customer.addToCart(readProductIdFromUser(), quantity);
                break;
            case 4:
                customer.removeFromCart(readProductIdFromUser());
                break;
            case 5 :
                customer.clearCart();
                break;
            case 6:
                customer.checkout();
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
