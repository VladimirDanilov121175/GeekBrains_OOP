package seminar4;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal> implements Iterable<Animal> {
    private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public AnimalIterator<Animal> iterator() {
        return new AnimalIterator<Animal>(this.getAnimals());
    }
}
