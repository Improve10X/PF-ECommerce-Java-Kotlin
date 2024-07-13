package javaapp;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Product, Integer> cartItems = new HashMap<>();

    public void addItem(Product product, int quantity) {
        if(cartItems.containsKey(product)) {
            int currentQuantity = cartItems.get(product);
            currentQuantity += quantity;
            cartItems.put(product, currentQuantity);
        } else {
            cartItems.put(product, quantity);
        }
    }

    public void removeItem(Product product) {
        cartItems.remove(product);
    }

    public void clearCart() {
        cartItems.clear();
    }

    public float getTotalPrice() {
        float totalPrice = 0.0f;
        for(Product product: cartItems.keySet()) {
            int quantity = cartItems.get(product);
            totalPrice += product.getFinalPrice() * quantity;
        }
        return totalPrice;
    }

    public void displayCart() {
        if(cartItems.isEmpty()) {
            System.out.println("Cart is empty");
        } else {
            for (Product product: cartItems.keySet()) {
                int quantity = cartItems.get(product);
                System.out.println(product.getName() + " x " + quantity + " = " + (product.getFinalPrice() * quantity));
            }
            System.out.println("Total Amount : " + getTotalPrice());
        }
    }
}
