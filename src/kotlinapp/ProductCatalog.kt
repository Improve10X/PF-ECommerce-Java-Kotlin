package kotlinapp

class ProductCatalog(val products: List<Product>) {

    fun getAllProducts(): List<Product> {
        return products
    }

    fun getProductById(id: String): Product {
        return products.first { id == it.name }
    }

}