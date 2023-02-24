package homework1;

public class Product {
    protected String name;
    protected double volume;
    protected String measureUnit;
    protected double price;

    /**
     * Full constructor for class Product
     * @param name
     * @param volume
     * @param measureUnit
     * @param price
     */
    public Product(String name, double volume, String measureUnit, double price) {
        this.name = name;
        this.volume = volume;
        this.measureUnit = measureUnit;
        this.price = price;
    }

    /** Constructor with default parameter "measureUnit" as liter */
    public Product(String name, double volume, double price) {
        this(name, volume, "l", price);
    }

    public void getProductInfo() {
        String info = String.format("""
                %s %.2f %s, price: %.2f""", this.getName(), this.getVolume(), this.getMeasureUnit(), this.getPrice());
        System.out.println(info);
    }

    // region getters
    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public double getPrice() {
        return price;
    }
    // endregion getters
}
