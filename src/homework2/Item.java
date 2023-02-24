package homework2;

abstract class Item {
    protected String brand;
    protected String model;
    protected String summary;

    /** Constructor */
    public Item(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.summary = String.format("%s %s", brand, model);
    }

    public String getSummary() { return this.summary; }
}
