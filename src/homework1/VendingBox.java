package homework1;

import java.util.ArrayList;

/** Parent class for vending automates */
public class VendingBox {
    private ArrayList<Product> products;

    public VendingBox() {
        this.products = new ArrayList<>();
    }

    public void showProductsInBox() {
        System.out.println("Goods to buy:");
        for (Product product : products) {
            product.getProductInfo();
        }
        System.out.println("--------------------------------");
    }

    public void addProductToBox(Product product) {
        if (!products.contains(product))
            this.products.add(product);
    }
}
