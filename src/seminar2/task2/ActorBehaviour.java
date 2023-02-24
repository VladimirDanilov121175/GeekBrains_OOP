package seminar2.task2;

public interface ActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean takeOrder);

    boolean isMakingOrder();
    boolean isTakingOrder();
}
