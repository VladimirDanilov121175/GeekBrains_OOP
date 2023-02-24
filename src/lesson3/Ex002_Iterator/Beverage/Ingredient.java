package lesson3.Ex002_Iterator.Beverage;

public abstract class Ingredient {
    protected String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.brand;
    }
}
