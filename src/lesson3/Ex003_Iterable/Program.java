package lesson3.Ex003_Iterable;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        Beverage latte = new Coffee();

        latte.addIngredient(new Beans("Superbeans"));
        latte.addIngredient(new Milk("SuperMilk"));
        latte.addIngredient(new Sugar("Sugar"));
        latte.addIngredient(new Water("Water"));

        // Один вариант пробежки по итератору
        for (Ingredient ingredient : latte) {
            System.out.println(ingredient);
        }

//        Iterable<Ingredient> iterator = latte;
//        for (var ingredient : iterator) {
//            System.out.println(ingredient);
//        }
    }
}
