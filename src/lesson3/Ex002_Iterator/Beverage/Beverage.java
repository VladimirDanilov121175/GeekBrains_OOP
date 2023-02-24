package lesson3.Ex002_Iterator.Beverage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Beverage implements Iterator<Ingredient> {
    List<Ingredient> components;
    int index;  // для переопределения методов интерфейса Iterator

    public Beverage() {
        this.components = new ArrayList<Ingredient>();
        this.index = 0;
    }

    public void addIngredient(Ingredient component) {
        this.components.add(component);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Ingredient next() {
        return components.get(index++);
    }
}
