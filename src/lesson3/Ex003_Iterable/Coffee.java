package lesson3.Ex003_Iterable;

import java.util.Iterator;

public class Coffee extends Beverage {
    @Override
    public Iterator<Ingredient> iterator() {

        Iterator<Ingredient> iter = new Iterator<Ingredient>() {

            private int index;

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Ingredient next() {
                return components.get(index++);
            }
        };

        return iter;
    }
}
