package lesson5.Ex002_Phonebook.Core.MVP;

import lesson5.Ex002_Phonebook.Core.Infrastructure.Contact;
import lesson5.Ex002_Phonebook.Core.Infrastructure.Phonebook;

import java.io.*;

/**
 * Класс, содержащий методы для работы с телефонной книгой: сохранение телефонной книги в базу данных
 * и загрузка книги контактов из базы данных
 *
 * @getCurrentBook()
 */
public class Model {
    private Phonebook currentBook;
    private String path;
    private int currentIndex;

    public Model(String path) {
        this.path = path;
        this.currentBook = new Phonebook();
        this.currentIndex = 0;
    }

    /**
     * Реализует возможность сохранять текущую телефонную книгу в стороннюю базу данных, если нужно
     */
    public void saveToDatabase() {
        try (FileWriter writer = new FileWriter(this.path, false)) {
            for (int i = 0; i < this.currentBook.countContacts(); i++) {
                Contact contact = this.currentBook.getContact(i);
                writer.append(String.format("%s\n", contact.firstName));
                writer.append(String.format("%s\n", contact.lastName));
                writer.append(String.format("%s\n", contact.description));
            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Реализует возможность загружать телефонную книгу из сторонней базы данных
     */
    public void loadFromDatabase() {

        // Открываем файл, считываем содержимое, загружаем содержимое в буфер для последующего построчного чтения
        try {
            File db = new File(this.path);
            FileReader fileReader = new FileReader(db);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Считываем построчно содержимое в буфере и добавляем новый контакт в телефонную книгу
            String firstName = bufferedReader.readLine();
            while (firstName != null) {
                String lastName = bufferedReader.readLine();
                String description = bufferedReader.readLine();
                this.currentBook.addContact(new Contact(firstName, lastName, description));
                firstName = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //region getters and setters
    public Phonebook getCurrentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }

    public Contact getCurrentContact() {
        if (!(this.currentBook == null) && this.currentIndex >= 0) {
            return this.currentBook.getContact(this.currentIndex);
        } else {
            System.out.println("Такого контакта нет");
            return null;
        }
    }
    //endregion
}
