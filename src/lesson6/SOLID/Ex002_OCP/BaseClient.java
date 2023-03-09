package lesson6.SOLID.Ex002_OCP;

// Open-closed principle
// Принцип открытости/закрытости
// Класс можно улучшать через наследование, но нельзя изменять, особенно, если он уже в продакшене.

public class BaseClient {
    public double getDiscount(double price) {
        return price * 0.95;
    }
}
