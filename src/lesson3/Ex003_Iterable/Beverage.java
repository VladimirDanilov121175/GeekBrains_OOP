package lesson3.Ex003_Iterable;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage implements Iterable<Ingredient> {
    List<Ingredient> components;
    int index;  // для переопределения методов интерфейса Iterator

    public Beverage() {
        this.components = new ArrayList<Ingredient>();
        this.index = 0;
    }

    public void addIngredient(Ingredient component) {
        this.components.add(component);
    }

}
