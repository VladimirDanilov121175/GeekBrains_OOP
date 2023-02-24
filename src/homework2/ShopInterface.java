package homework2;

import java.util.Map;
import java.util.Set;

public interface ShopInterface {
    void showItems(Set<Item> inStock);
    Map<String, String> chooseFilters(Set<Item> inStock);
    Set<Item> filterItems(Set<Item> items, Map<String, String> queryFromUser);
}
