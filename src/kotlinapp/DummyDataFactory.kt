package kotlinapp

import javaapp.Product
import javaapp.ProductCatalog
import java.util.ArrayList

object DummyDataFactory {
    fun createDummyData(): List<Product> {
        val products: MutableList<Product> = ArrayList()
        products.add(Product("Laptop", 700f, 10))
        products.add(Product("Phone", 500f, 5))
        products.add(Product("Headphones", 100f, 0))
        products.add(Product("Mouse", 30f, 20))
        products.add(Product("Keyboard", 50f, 15))
        return products
    }

    fun preloadData(productCatalog: ProductCatalog) {
        productCatalog.products.addAll(createDummyData())
    }
}