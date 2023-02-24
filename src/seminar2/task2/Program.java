package seminar2.task2;

public class Program {
    public static void main(String[] args) {

        Market market = new Market();

        Actor human1 = new Human("John");
        market.acceptToMarket(human1);
        market.acceptToMarket(new Human("Vladimir"));
        market.acceptToMarket(new Human("ELena"));

        market.update();
    }
}
