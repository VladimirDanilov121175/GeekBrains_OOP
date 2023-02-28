package homework4;

public abstract class Product {
    protected String brand;
    protected double volume;
    protected String measureUnit;
    protected double price;

    /**
     * Full constructor for class Product
     * @param brand
     * @param volume
     * @param measureUnit
     * @param price
     */
    public Product(String brand, double volume, String measureUnit, double price) {
        this.brand = brand;
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
                %s %.2f %s, price: %.2f""", this.getBrand(), this.getVolume(), this.getMeasureUnit(), this.getPrice());
        System.out.println(info);
    }

    // region getters
    public String getBrand() {
        return brand;
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
