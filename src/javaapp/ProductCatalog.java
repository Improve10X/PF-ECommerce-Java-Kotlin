package javaapp;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {

    public List<Product> products = new ArrayList<>();

    public ProductCatalog() {

    }

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
