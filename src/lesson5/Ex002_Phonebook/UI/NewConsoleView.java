package lesson5.Ex002_Phonebook.UI;

/**
 * Чисто в демонстративных целях - показать, как необходимо поступать, если вдруг захотелось сделать новый релиз
 * приложения с обновленным интерфейсом.
 * Правилом хорошего тона считается поддерживать старую версию еще некоторое время, пусть она и работает криво по
 * твоему мнению. В этом случае объявляется, что старый релиз перестанет поддерживаться через некоторое время, и
 * действует новый релиз.
 */
public class NewConsoleView extends ConsoleVew{

    // Для примера - релиз новой версии метода showDescription()

    public NewConsoleView() {
        super();
    }

    @Override
    public void showDescription(String description) {
        System.out.printf("New released description: %s", description);
    }
}
