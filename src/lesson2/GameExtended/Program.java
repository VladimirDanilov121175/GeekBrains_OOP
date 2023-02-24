package lesson2.GameExtended;

import lesson2.GameExtended.alliance.Dwarf;

public class Program {
    public static void main(String[] args) {
        BaseHero mag2 = new Magician();
        System.out.println(mag2.getInfo());

        Priest priest = new Priest();
        System.out.println(priest.getInfo());

        System.out.println("------------------------------------------------");

        mag2.Attack(priest);
        priest.Attack(mag2);
        System.out.println(mag2.getInfo());
        System.out.println(priest.getInfo());
        System.out.println("------------------------------------------------");

//        Druid druid = new Druid();
//        druid.healing(priest);
        BaseHero druid = new Druid();
        System.out.println(druid.getInfo());
        ((Druid) druid).healing(priest);    // Casting BaseHero to Druid
        System.out.println(priest.getInfo());
        System.out.println("------------------------------------------------");

        BaseHero dwarf = new Dwarf();
        Druid dwarf2 = new Dwarf();
        Dwarf dwarf3 = new Dwarf();
        System.out.println(dwarf.getInfo());
        System.out.println(dwarf2.getInfo());
        System.out.println(dwarf3.getInfo());

        ((Dwarf) dwarf).dwarfMethod();
        ((Dwarf) dwarf2).dwarfMethod();
        dwarf3.dwarfMethod();
        dwarf3.healing(mag2);
        System.out.println(mag2.getInfo());
    }
}
