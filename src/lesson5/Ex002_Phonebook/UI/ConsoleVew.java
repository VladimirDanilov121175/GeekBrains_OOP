package lesson5.Ex002_Phonebook.UI;

import lesson5.Ex002_Phonebook.Core.MVP.View;

import java.util.Scanner;

/**
 * Класс для реализации работы с консолью - ввод полей контакта и отображение полей
 */
public class ConsoleVew implements View {

    private Scanner scanner;

    public ConsoleVew(){
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String setFirstName() {
        System.out.print("First name: ");
        return scanner.nextLine();
    }

    @Override
    public String setLastName() {
        System.out.print("Last name: ");
        return scanner.nextLine();
    }

    @Override
    public String setDescription() {
        System.out.print("Description: ");
        return scanner.nextLine();
    }

    @Override
    public void showDescription(String description) {
        System.out.printf("%s\n", description);
    }

    @Override
    public void showFirstName(String firstName) {
        System.out.printf("%s ", firstName);
    }

    @Override
    public void showLastName(String lastName) {
        System.out.printf("%s\n", lastName);
    }
}
