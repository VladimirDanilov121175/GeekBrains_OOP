package homework2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Set<Item> laptops = new HashSet<>();

        // Manually adding new laptops
        laptops.add(new Laptop("Windows 10 Home", "Samsung", "Model 1", 16,
                512, 15, "FullHD", "для дома"));

        // Create a set of 500 laptops. Just for saving time
        LaptopGenerator generator = new LaptopGenerator();
        generator.addLaptopsToStock(laptops);

        Map<String, String> searchQuery = shop.chooseFilters(laptops);
        Set<Item> searchResult = shop.filterItems(laptops, searchQuery);

        System.out.println("Вот, что нашлось по Вашему запросу:");
        shop.showItems(searchResult);
    }
}
