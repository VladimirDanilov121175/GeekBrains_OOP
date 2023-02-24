package lesson1.Game;

public class Program {
    public static void main(String[] args) {
        Magician mag1 = new Magician();
        System.out.println(mag1.getInfo());

        BaseHero mag2 = new Magician();
        System.out.println(mag2.getInfo());

        Priest priest = new Priest();
        System.out.println(priest.getInfo());

        System.out.println("------------------------------------------------");

        mag2.Attack(priest);
        priest.Attack(mag2);
        System.out.println(mag2.getInfo());
        System.out.println(priest.getInfo());
    }
}
