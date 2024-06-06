package ejercicio_supermercado;

/**
 * Class representing a beverage product.
 */
public class Beverage extends Product{
    private double liters;

    /**
     * Constructs a Beverage with the specified name, liters, and price.
     * @param name name of the beverage
     * @param liters amount of liters
     * @param price price of the beverage
     */
    public Beverage(String name, double liters, double price) {
        super(name, price);
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + " /// Litros: " + liters + " /// Precio: $" + formatPrice();
    }

}
