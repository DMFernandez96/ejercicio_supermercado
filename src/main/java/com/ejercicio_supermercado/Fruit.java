package ejercicio_supermercado;

/**
 * Class representing a fruit product.
 */
public class Fruit extends Product{
    private String salesUnit;

    /**
     * Constructs a Fruit with the specified name, price, and unit of sale.
     * @param name name of the fruit
     * @param price price of the fruit
     * @param salesUnit the unit of sale
     */
    public Fruit(String name, double price, String salesUnit) {
        super(name, price);
        this.salesUnit = salesUnit;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + " /// Precio: $" + formatPrice() + " /// Unidad de venta: " + salesUnit;
    }
}
