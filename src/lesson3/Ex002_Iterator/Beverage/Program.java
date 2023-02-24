package lesson3.Ex002_Iterator.Beverage;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        Beverage latte = new Coffee();

        latte.addIngredient(new Beans("Superbeans"));
        latte.addIngredient(new Milk("SuperMilk"));
        latte.addIngredient(new Sugar("Sugar"));
        latte.addIngredient(new Water("Water"));

//        // Один вариант пробежки по итератору
//        while (latte.hasNext()) {
//            System.out.println(latte.next());
//        }

        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
