package homework4;

public abstract class SnacksAndDrinks extends Product{
    public SnacksAndDrinks(String brand, double volume, String measureUnit, double price) {
        super(brand, volume, measureUnit, price);
    }

    public SnacksAndDrinks(String name, double volume, double price) {
        super(name, volume, price);
    }
}
