package homework3;

import java.util.Iterator;
import java.util.List;

public class VendingBoxIterator implements Iterator<Product> {

    private final List<Product> productList;
    private int index;

    public VendingBoxIterator(VendingBox vendingBox) {
        this.productList = vendingBox.getProducts();
    }

    @Override
    public boolean hasNext() {
        return index < productList.size();
    }

    @Override
    public Product next() {
        return this.productList.get(index++);
    }
}
