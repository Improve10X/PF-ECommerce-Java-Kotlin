package javaapp;

public class Product {

    private String name;
    private float price;
    private int discountPercentage;

    public Product(String name, float price, int discountPercentage) {
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public float calculateDiscount() {
        return price * (discountPercentage / 100.0f);
    }

    public float getFinalPrice() {
        return price - calculateDiscount();
    }
}
