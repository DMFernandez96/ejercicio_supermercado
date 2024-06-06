package ejercicio_supermercado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Main class representing the supermarket application.
 */
public class Supermarket {

    public static void main(String[] args) {
        List<Product> products = loadProducts();

        // Print each product
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("=============================");

        // Find and print the most expensive and the cheapest product
        Product mostExpensiveProduct = Collections.max(products);
        Product cheapestProduct = Collections.min(products);

        System.out.println("Producto más caro: " + mostExpensiveProduct.getName());
        System.out.println("Producto más barato: " + cheapestProduct.getName());
    }

    /**
     * Loads the list of products for the supermarket.
     * @return list of products
     */
    private static List<Product> loadProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Beverage("Coca-Cola Zero", 1.5, 20));
        products.add(new Beverage("Coca-Cola", 1.5, 18));
        products.add(new HouseholdItem("Shampoo Sedal", 500, 19));
        products.add(new Fruit("Frutillas", 64, "kilo"));
        return products;
    }
}
