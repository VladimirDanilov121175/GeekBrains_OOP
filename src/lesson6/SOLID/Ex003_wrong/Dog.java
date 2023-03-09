package lesson6.SOLID.Ex003_wrong;

public class Dog extends BaseAnimal {
    @Override
    public String getType() {
        return "собачка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}
