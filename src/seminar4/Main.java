package seminar4;

public class Main {
    public static void main(String[] args) {

        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(new Penguin());
        zoo.addAnimal(new Cat("Barsik"));
        zoo.addAnimal(new Crocodile());

//        AnimalIterator<Animal> it = zoo.iterator();
//        while (it.hasNext()) {
//            it.next().sayHi();
//        }

        for (Animal animal : zoo) {
            animal.sayHi();
        }
    }
}
