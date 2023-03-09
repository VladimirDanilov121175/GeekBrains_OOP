package lesson6.SOLID.Ex002_usual;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Client(1).getDiscount(100));
        System.out.println(new Client(2).getDiscount(100));
    }
}
