package seminar1;

import java.util.ArrayList;

public class VendingBox {
    private ArrayList<Product> products;

    public VendingBox() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
