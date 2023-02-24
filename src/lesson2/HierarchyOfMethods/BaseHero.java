package lesson2.HierarchyOfMethods;

public abstract class BaseHero {
    protected int hp;

    public BaseHero(String name, int hp) {
        System.out.println("Вызван метод BaseHero(String name, int hp)");
        this.hp = hp;
    }

    public BaseHero() {
        this("", 0);
        System.out.println("Вызван метод BaseHero()");
    }
}
