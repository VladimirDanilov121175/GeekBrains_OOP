package lesson2.HierarchyOfMethods;

public class Dwarf extends Druid {
    private int mp;

    public Dwarf(String name, int hp, int mp) {
        super();
        System.out.println("Вызван метод Dwarf(String name, int hp, int mp)");
        this.mp = mp;
        this.hp = (int) (hp * 0.8);
    }

    public Dwarf() {
        this("", 0, 100);
        System.out.println("Вызван метод Dwarf()");
    }
}
