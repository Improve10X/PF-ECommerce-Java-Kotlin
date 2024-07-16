package javaapp;

import java.util.ArrayList;
import java.util.List;

public class DummyDataFactory {

    public static List<Product> createDummyData() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 700, 10));
        products.add(new Product("Phone", 500, 5));
        products.add(new Product("Headphones", 100, 0));
        products.add(new Product("Mouse", 30, 20));
        products.add(new Product("Keyboard", 50, 15));
        return products;
    }

    public static void preloadData(ProductCatalog productCatalog) {
        productCatalog.products.addAll(createDummyData());
    }
}
