package ejercicio_supermercado;

/**
 * Class representing a household item.
 */
public class HouseholdItem extends Product{
    private int content;

    /**
     * Constructs a HouseholdItem with the specified name, content, and price.
     * @param name name of the household item
     * @param content content in ml
     * @param price price of the household item
     */
    public HouseholdItem(String name, int content, double price) {
        super(name, price);
        this.content = content;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + " /// Contenido: " + content + "ml /// Precio: $" + formatPrice();
    }

}
