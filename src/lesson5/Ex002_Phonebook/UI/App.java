package lesson5.Ex002_Phonebook.UI;

import lesson5.Ex002_Phonebook.Core.MVP.Presenter;
import lesson5.Ex002_Phonebook.Core.MVP.View;
import lesson5.Ex002_Phonebook.Database;

import java.util.Scanner;

/**
 * Класс, предлагающий пользователю интерактивный интерфейс, т.е. готовое "приложение"
 */
public class App {
    public static void buttonClick() {
        System.out.print("\033[H\033[J"); // ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы

        // Создаем экземпляры view и presenter
        View view = new ConsoleVew();
        Presenter presenter = new Presenter(view, Database.pathDb);

        // Загружаем телефонный справочник из БД (реализация скрыта инкапсуляцией)
        presenter.loadPhonebook();

        if (presenter.model.getCurrentBook().countContacts() < 3) {
            while (presenter.model.getCurrentBook().countContacts() < 3) {
                presenter.add();
            }
            presenter.saveToFile();
        }

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("""
                    Главное меню:
                    1 - навигация по телефонному справочнику
                    2 - добавить контакты
                    3 - удалить контакты
                    Нажмите любую другую клавишу для выхода из приложения
                    >>>""");
            String key = sc.nextLine();

            switch (key) {
                case "1" -> {
                    while (true) {
                        System.out.println("1 - next   2 - previous");
                        String choice = sc.nextLine();
                        System.out.print("\033[H\033[J");
                        switch (choice) {
                            case "1" -> presenter.nextContact();
                            case "2" -> presenter.prevContact();
                            default -> System.out.println("No such command");
                        }
                    }
                }
                case "2" -> presenter.add();
                case "3" -> presenter.remove();
                default -> System.out.println("Работа завершена");
            }


        }
    }
}
