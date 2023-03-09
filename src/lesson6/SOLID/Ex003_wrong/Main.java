package lesson6.SOLID.Ex003_wrong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<BaseAnimal> animals = new ArrayList<>(Arrays.asList(new Cat(), new Dog(), new Fish()));

        for (BaseAnimal animal : animals) {
            System.out.println(animal.getType() + " " + animal.getLegsCount());
        }
    }
}
