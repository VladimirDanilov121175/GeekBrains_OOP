package lesson5.Ex002_Phonebook.Core.MVP;

public interface View {
    String setFirstName();
    String setLastName();
    String setDescription();
    void showDescription(String description);
    void showFirstName(String firstName);
    void showLastName(String lastName);
}
