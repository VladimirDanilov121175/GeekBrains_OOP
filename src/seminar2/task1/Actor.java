package seminar2.task1;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakingOrder;
    protected boolean isTakingOrder;

    public Actor(String name) {
        this.name = name;
        this.isMakingOrder = false;
        this.isTakingOrder = false;
    }

    public abstract String getName();

    public String getCurrentStaus() {
        return String.format("""
                Buyer %s:
                is making order: %b
                is taking order: %b""",
                this.name, this.isMakingOrder, this.isTakingOrder);
    }
}
