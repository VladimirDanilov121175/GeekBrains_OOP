package seminar2.task2;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakingOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakingOrder = takeOrder;
    }

    @Override
    public boolean isMakingOrder() {
        return super.isMakingOrder;
    }

    @Override
    public boolean isTakingOrder() {
        return super.isTakingOrder;
    }
}
