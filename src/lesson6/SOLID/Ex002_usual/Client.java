package lesson6.SOLID.Ex002_usual;

public class Client {
    private int clientType;

    public Client(int type) {
        this.clientType = type;
    }

    public double getDiscount(double price) {
        return clientType == 1 ? price * 0.85 : price * 0.95;
    }
}
