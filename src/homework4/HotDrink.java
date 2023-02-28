package homework4;

public abstract class HotDrink extends Product {
    private final int temperature;

    public HotDrink(String brand, double volume, double price) {
        super(brand, volume, price);
        this.temperature = 85;
    }

    public void getProductInfo() {
        super.getProductInfo();
        System.out.printf("Attention! Hot drink! Temperature: %d\n", this.temperature);
    }
}
