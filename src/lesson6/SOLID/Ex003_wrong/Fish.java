package lesson6.SOLID.Ex003_wrong;

public class Fish extends BaseAnimal {
    @Override
    public String getType() {
        return "рыбка";
    }

    @Override
    public int getLegsCount() throws Exception {
        throw new Exception("Я же рыбка, у меня нет лапок");
    }
}
