package javaapp;

public class Customer {
    private ShoppingCart shoppingCart;
    private ProductBrowser productBrowser;

    public Customer(ShoppingCart shoppingCart, ProductBrowser productBrowser) {
        this.shoppingCart = shoppingCart;
        this.productBrowser = productBrowser;
    }

    public void viewProductListing() {
        productBrowser.displayProducts();
    }

    public void viewProductDetails(String productId) {
        productBrowser.displayProductDetails(productId);
    }

    public void addToCart(String productId, int quantity) {
        Product product = productBrowser.getProductCatalog().getProductById(productId);
        if(product != null) {
            shoppingCart.addItem(product, quantity);
            System.out.println(quantity + " " + product.getName() + " added to cart");
        } else {
            System.out.println("Product not found");
        }
    }

    public void removeFromCart(String productId) {
        Product product = productBrowser.getProductCatalog().getProductById(productId);
        if(product != null) {
            shoppingCart.removeItem(product);
            System.out.println(product.getName() + " removed from cart");
        } else {
            System.out.println("Product not found");
        }
    }

    public void clearCart() {
        shoppingCart.clearCart();
    }

    public void checkout() {
        shoppingCart.displayCart();
    }
}
