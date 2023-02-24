package seminar1;

public class Main {
    public static void main(String[] args) {
        VendingBox vbox = new VendingBox();
        vbox.addProduct(new Product("cola", 45));
        vbox.addProduct(new Product("fanta", 45));
        vbox.addProduct(new Product("mars", 60.5));
        vbox.addProduct(new Product("snickers", 61.45));

        System.out.println(vbox.getProducts());
    }
}
