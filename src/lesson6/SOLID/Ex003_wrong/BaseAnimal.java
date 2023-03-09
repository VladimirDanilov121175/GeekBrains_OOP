package lesson6.SOLID.Ex003_wrong;

// Пример неправильного построения иерархии, когда некоторые наследники "ломают" поведение родителя

abstract class BaseAnimal {
    public String getType() {
        return "animal";
    }

    // А вот и место, где может сломаться поведение родительского класса при наследовании, так как не все
    // животные имеют лапы
    public int getLegsCount() throws Exception {
        return 0;
    }
}
