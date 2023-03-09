package lesson6.SOLID.Ex003_LSP;

public class Dog extends Animal implements Legs{
    @Override
    public int getLegsCount() {
        return 4;
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
