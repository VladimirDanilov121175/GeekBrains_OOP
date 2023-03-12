package homework6.view;

import homework6.controller.FactoryController;
import homework6.service.Fill;

import java.util.Scanner;

public class ConsoleView implements ViewInterface{
    private final FactoryController controller = new FactoryController();

    @Override
    public void orderDoughnut() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose filling:");
        for (Fill filling : Fill.values()) {
            System.out.println(filling.ordinal() + " " + filling);
        }

        int choice = scanner.nextInt();

        System.out.println("Set the amount:");
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
        controller.eatDoughnut(Fill.values()[choice]);
        }

        controller.showOrder();
    }

}
