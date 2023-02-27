package seminar4;

import java.util.Iterator;
import java.util.List;

public class AnimalIterator<T extends Animal> implements Iterator<T> {

    int index;
    List<T> animals;

    public AnimalIterator(List<T> animals) {
        this.animals = animals;
    }

    @Override
    public boolean hasNext() {
        return index < animals.size();
    }

    @Override
    public T next() {
        return animals.get(index++);
    }
}
