package lesson6.SOLID.Ex003_wrong;

public class Cat extends BaseAnimal{
    @Override
    public String getType() {
        return "кошечка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}
