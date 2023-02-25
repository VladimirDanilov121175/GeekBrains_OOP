package homework3;

import java.util.ArrayList;
import java.util.Iterator;

/** Parent class for vending automates */
public class VendingBox implements Iterable<Product>{
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

    @Override
    public VendingBoxIterator iterator() {
        return new VendingBoxIterator(this);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
