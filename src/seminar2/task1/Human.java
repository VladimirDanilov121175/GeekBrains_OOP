package seminar2.task1;

public class Human extends Actor {


    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean b) {
        super.isMakingOrder = true;
    }

    @Override
    public void setTakeOrder(boolean b) {
        super.isTakingOrder = true;
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
