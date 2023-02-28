package homework4;

import java.util.Iterator;
import java.util.List;

public class VendingBoxIterator<T extends Product> implements Iterator<T> {

    List<T> productList;
    int index;

    public VendingBoxIterator(List<T> productList) {
        this.productList = productList;
    }

    @Override
    public boolean hasNext() {
        return index < this.productList.size();
    }

    @Override
    public T next() {
        return this.productList.get(index++);
    }
}
