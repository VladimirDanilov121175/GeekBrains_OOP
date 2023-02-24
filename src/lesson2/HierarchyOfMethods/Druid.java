package lesson2.HierarchyOfMethods;

public class Druid extends BaseHero {

    public Druid(String name, int hp) {
        super(name, hp);
        System.out.println("Вызван метод Druid(String name, int hp)");
    }

    public Druid(){
        this("", 100);
        // super("", 100);
        System.out.println("Вызван метод Druid()");
    }
}
