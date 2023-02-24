package seminar1;

public class Product {
    private String product;
    private double price;

    /**
     * Constructor for new product
     */
    public Product(String product, double price) {
        this.product = product;
        this.price = price;
    }

    // region getters and setters
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // endregion getters and setters


    @Override
    public String toString() {
        return String.format("%s %.2f руб.",
                this.product.substring(0, 1).toUpperCase()
                + this.product.substring(1), this.price);
    }
}
