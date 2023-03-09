package lesson6.SOLID.Ex002_OCP;

// Open-closed principle
// Принцип открытости/закрытости
// Можно улучшать, но нельзя изменять

public class Main {
    public static void main(String[] args) {

        System.out.println(new BaseClient().getDiscount(100));
        System.out.println(new SilverClient().getDiscount(100));
        System.out.println(new VIPClient().getDiscount(100));
    }
}
