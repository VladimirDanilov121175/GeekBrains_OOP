package lesson6.SOLID.Ex005_DIP;

// Dependency Inversion Principal - принцип инверсии зависимостей.
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
//   И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

// модуль нижнего уровня, который можно подменять другим модулем на более высоком уровне, например, модулем WindowView
public class ConsoleView implements View {
    @Override
    public void print(String text) {
        String result = String.format("Console view: %s", text);
        System.out.println(result);
    }
}
