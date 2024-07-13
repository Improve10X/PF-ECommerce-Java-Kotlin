package javaapp;

import java.util.List;

public class ProductCatalog {

    private List<Product> products;

    public ProductCatalog(List<Product> products) {
        this.products = products;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(String id) {
        for(Product product: products) {
            if(id.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }
}
