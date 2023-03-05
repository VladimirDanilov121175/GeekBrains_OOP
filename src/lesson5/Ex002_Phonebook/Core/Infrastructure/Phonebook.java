package lesson5.Ex002_Phonebook.Core.Infrastructure;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts;

    public Phonebook() {
        this.contacts = new ArrayList<Contact>();
    }

    // read contact
    public Contact getContact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

//    Относится к предыдущему методу. Проверяет, не пустая ли книга, и находится ли индекс в диапазоне размера книги.
    public boolean contains(int index) {
        return contacts != null && contacts.size() > index;
    }

    // Интересный метод от Камянецкого добавления нового контакта в телефонную книгу
    public boolean addContact(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    // remove contact
    public boolean removeContact(Contact contact) {
        boolean flag = false;
        if (contacts.contains(contact)) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }

    //update contact
    public boolean updateContact(Contact contact) {
        boolean flag = false;
        // ???
        return flag;
    }

    public List<Contact> getContacts() {
        if (!(contacts.isEmpty())) {
            return contacts;
        } else {
            System.out.println("Телефонная книга не содержит контактов");
            return null;
        }
    }

    public int countContacts(){
        return contacts.size();
    }
}
