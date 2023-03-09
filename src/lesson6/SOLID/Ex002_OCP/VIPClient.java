package lesson6.SOLID.Ex002_OCP;

public class VIPClient extends SilverClient {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}
