package lesson6.SOLID.Ex003_LSP;

// Отдельный интерфейс для имплементации только теми наследниками класса Animals, которые имеют лапы
public interface Legs {
    int getLegsCount();
}
