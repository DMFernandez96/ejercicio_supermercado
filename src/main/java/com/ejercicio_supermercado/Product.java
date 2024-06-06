package ejercicio_supermercado;

import java.text.DecimalFormat;

/**
 * Abstract class representing a general product in the supermarket.
 */
abstract class Product implements Comparable<Product> {
    private String name;
    private double price;

    /**
     * Constructs a Product with the specified name and price.
     * @param name name of the product
     * @param price price of the product
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Formats the price to avoid showing unnecessary decimals.
     *
     * @return formatted price as a string
     */
    protected String formatPrice() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(price);
    }

    /**
     * Compares products based on their price.
     * @param otherProduct the product to be compared.
     * @return a negative integer, zero, or a positive integer as this product's
     * price is less than, equal to, or greater than the specified product's price.
     */
    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }
    @Override
    public abstract String toString();

}

