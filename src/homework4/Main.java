package homework4;

import homework4.hotDrinks.Coffee;
import homework4.hotDrinks.HotChocolate;
import homework4.hotDrinks.Tea;
import homework4.snacksAndDrinks.BottledWater;
import homework4.snacksAndDrinks.Snack;
import homework4.snacksAndDrinks.Soda;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        VendingBox<SnacksAndDrinks> vendingBox = new VendingBox<>();
        vendingBox.addProductToBox(new Snack("Mars", 85, "gramm", 110.25));
        vendingBox.addProductToBox(new Snack("Snickers", 85, "gramm", 115.25));
        vendingBox.addProductToBox(new Soda("Soda", 85, 125.5));
        vendingBox.addProductToBox(new BottledWater("PureWater", 0.5, 70));
//        vendingBox.addProductToBox(new Coffee("Coffee", 0.250, 150.25));

        // region hot drink vending automate
        VendingBox<HotDrink> hotDrinkVendingBox = new VendingBox<>();
        hotDrinkVendingBox.addProductToBox(new Coffee("Latte", 0.250, 150.25));
        hotDrinkVendingBox.addProductToBox(new Tea("Earl Grey", 0.250, 110.75));
        hotDrinkVendingBox.addProductToBox(new HotChocolate("Chocolate", 0.250, 130.5));
        // endregion

        // region iterators
        for (SnacksAndDrinks product : vendingBox) {
            product.getProductInfo();
        }

        System.out.println("--------------------------------");

        Iterator<HotDrink> iterator = hotDrinkVendingBox.iterator();
        while (iterator.hasNext()) {
            iterator.next().getProductInfo();
        }
        //endregion

    }
}
