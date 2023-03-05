package lesson5.Ex002_Phonebook.Core.Infrastructure;

import java.time.LocalDate;
import java.util.Objects;

public class Contact implements Comparable<Contact> {

    public LocalDate date;
    public String firstName;
    public String lastName;
    public String company;
    public String phone;
    public String description;

    public String email;
    // public Email email;  // Камянецкий советует подумать над почтой, как ее реализовать, возможно, в виде отдельной сущности


//    В демонстративных целях конструктор задан только с 3 полями, хотя их больше
    public Contact(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    //TODO Пока непонятно, для чего Камянецкий в лекции создал этот метод и оставил нам дописывать.
    // Вероятно для самостоятельной реализации сортировки телефонного справочника по алфавиту
    @Override
    public int compareTo(Contact o) {
        /// ???
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) && Objects.equals(lastName, contact.lastName);
    }
}
