package seminar2.task1;

public interface ActorBehaviour {
    void setMakeOrder(boolean b);
    void setTakeOrder(boolean b);

    boolean isMakingOrder();
    boolean isTakingOrder();
}
