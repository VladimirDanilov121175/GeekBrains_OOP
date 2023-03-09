package lesson6.SOLID.Ex003_LSP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        В общий список "животные" мы можем добавить любых наследников родительского класса
        List<Animal> animals = new ArrayList<Animal>(Arrays.asList(new Cat(), new Dog(), new Fish(), new Python()));

        for (Animal animal : animals) {
            System.out.println(animal.getType());
        }

        System.out.println();

        // Добавить рыбку и питона не получится
        List<Legs> animalsWithLegs = new ArrayList<>();
        animalsWithLegs.add(new Cat());
        animalsWithLegs.add(new Dog());
//        animalsWithLegs.add(new Python());
//        animalsWithLegs.add(new Fish());

        for (Legs animal : animalsWithLegs) {
            System.out.println(animal.getLegsCount());
        }
    }
}
