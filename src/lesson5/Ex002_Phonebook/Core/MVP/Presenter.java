package lesson5.Ex002_Phonebook.Core.MVP;

import lesson5.Ex002_Phonebook.Core.Infrastructure.Contact;

/**
 * Соединяет работу Model и View
 */
public class Presenter {
    public Model model;
    public View view;

    public Presenter(View view, String pathDb) {
        this.model = new Model(pathDb);
        this.view = view;
    }

    public void loadPhonebook() {
        model.loadFromDatabase(); // пример инкапсуляции загрузки телефонной книги из базы данных

        // Задаем "начальное" отображение телефонного справочника в консоли - первый контакт в списке
        if (model.getCurrentBook().countContacts() > 0) {
            model.setCurrentIndex(0);
            var currentContact = model.getCurrentContact();
            view.showFirstName(currentContact.firstName);
            view.showLastName(currentContact.lastName);
            view.showDescription(currentContact.description);
        }
    }

    public void saveToFile() {
        model.saveToDatabase(); // инкапсуляция сохранения телефонной книги в базу данных
    }

    public void add() {
        model.getCurrentBook().
                addContact(new Contact(
                        view.setFirstName(), view.setLastName(), view.setDescription()
                ));
    }

    public void remove() {
        Contact contact = new Contact(view.setFirstName(), view.setLastName(), view.setDescription());
        model.getCurrentBook().removeContact(contact);
        if (model.getCurrentBook().countContacts() < 1) {
            model.setCurrentIndex(-1);

            view.showFirstName("");
            view.showLastName("");
            view.showDescription("");

        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0) {
                model.setCurrentIndex(0);
                Contact prevContact = model.getCurrentContact();
                view.showFirstName(prevContact.firstName);
                view.showLastName(prevContact.lastName);
                view.showDescription(prevContact.description);
            }
        }
    }

    // region Навигация по телефонному справочнику - листание контактов
    public void nextContact() {
        if (model.getCurrentIndex() + 1 < model.getCurrentBook().countContacts()) {
            model.setCurrentIndex(model.getCurrentIndex() + 1);
            Contact currentContact = model.getCurrentContact();
            view.showFirstName(currentContact.firstName);
            view.showLastName(currentContact.lastName);
            view.showDescription(currentContact.description);
        }
    }

    public void prevContact() {
        if (model.getCurrentIndex() - 1 > -1) {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            Contact currentContact = model.getCurrentContact();
            view.showFirstName(currentContact.firstName);
            view.showLastName(currentContact.lastName);
            view.showDescription(currentContact.description);
        }
    }
    //endregion
}
