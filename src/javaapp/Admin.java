package javaapp;

import java.util.Scanner;

public class Admin {

    private ProductCatalog productCatalog;

    public Admin(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public void addNewProduct() {
        System.out.print("Enter product name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Enter product price : ");
        float price = scanner.nextFloat();
        System.out.print("Enter discount percentage : ");
        int discountPercentage = scanner.nextInt();
        Product product = new Product(name, price, discountPercentage);
        productCatalog.products.add(product);
        System.out.print("Product added successfully!");
    }

    public void updateProduct() {
        Scanner scanner = new Scanner(System.in);
        Product product = getProductFromUser();
        if(product != null) {
            System.out.print("Enter new price : ");
            float newPrice = scanner.nextFloat();
            product.setPrice(newPrice);
            System.out.print("Enter new discount percentage : ");
            int newDiscountPercentage = scanner.nextInt();
            product.setDiscountPercentage(newDiscountPercentage);
            System.out.println("Product updated Successfully!");
        } else {
            System.out.print("Product not found");
        }
    }

    private Product getProductFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to update : ");
        String productId = scanner.nextLine();
        Product product = productCatalog.getProductById(productId);
        return product;
    }

    public void removeProduct(String productId) {
        Product product = getProductFromUser();
        if(product != null) {
            productCatalog.products.remove(product);
            System.out.print("Product removed successfully!");
        } else {
            System.out.print("Product not found");
        }
    }

    public void viewAllProducts() {
        for(Product product: productCatalog.products) {
            System.out.print(product.getName() + " - " +product.getPrice() +" - "  + product.getDiscountPercentage());
        }
    }
}
