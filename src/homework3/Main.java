package homework3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        VendingBox vBox = new VendingBox();

        vBox.addProductToBox(new Product("Cola", 0.5, 45.50));
        vBox.addProductToBox(new Product("Pepsi", 0.5, 45.50));
        vBox.addProductToBox(new Product("Fanta", 0.5, 45.50));
        vBox.addProductToBox(new Product("Mars", 80, "gr", 80));
        vBox.addProductToBox(new Product("Snickers", 80, "gr", 82.3));
        vBox.showProductsInBox();

        VendingBox hotBox = new HotDrinkBox();
        hotBox.addProductToBox(new HotDrink("Capuccino", 0.25, 120.25));
        hotBox.addProductToBox(new HotDrink("Americano Expresso", 0.25, 110.5));
        hotBox.addProductToBox(new HotDrink("Hot chocolate", 0.25, 90));
        hotBox.showProductsInBox();


        // Iterator demo - show products under price 50
        Iterator<Product> iterator = vBox.iterator();
        while (iterator.hasNext()) {
            var product = iterator.next();
            if (product.getPrice() < 50) {
                product.getProductInfo();
            }
        }

        System.out.println();

        // Iterator demo - show products over price 100
        // Another way to iterate over products - by forEach
        for (Product hotDrink : hotBox) {
            if (hotDrink.getPrice() > 100) {
                hotDrink.getProductInfo();
            }
        }

    }
}
