package lesson2.HierarchyOfMethods;

public class Program {
    public static void main(String[] args) {
        System.out.println("BaseHero dwarf1 = new Dwarf()");
        BaseHero dwarf1 = new Dwarf();
        System.out.println(dwarf1);

        System.out.println("\nDruid dwarf2 = new Dwarf()");
        Druid dwarf2 = new Dwarf();
        System.out.println(dwarf2);

        System.out.println("\nDwarf dwarf3 = new Dwarf()");
        Dwarf dwarf3 = new Dwarf();
        System.out.println(dwarf3);
    }
}
