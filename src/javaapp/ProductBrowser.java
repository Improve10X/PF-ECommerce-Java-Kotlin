package javaapp;

public class ProductBrowser {
    private ProductCatalog productCatalog;

    public ProductBrowser(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public void displayProducts() {
        // TODO : display in tabular form
    }

    public void displayProductDetails(String productId) {
        // TODO : display in tabular form
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
}
