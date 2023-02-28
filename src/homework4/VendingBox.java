package homework4;

import java.util.ArrayList;
import java.util.Iterator;

/** Parent class for vending automates */
public class VendingBox<T extends Product> implements Iterable<T> {
    private ArrayList<T> products;

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

    public void addProductToBox(T product) {
        if (!products.contains(product))
            this.products.add(product);
    }

    @Override
    public Iterator<T> iterator() {
        return new VendingBoxIterator<T>(this.products);
    }
}
