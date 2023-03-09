package lesson6.SOLID.Ex003_LSP;

public class Cat extends Animal implements Legs{

    @Override
    public String getType() {
        return "cat";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}
