package homework2;

import java.util.*;

public class Shop implements ShopInterface {

    protected Scanner scanner = new Scanner(System.in);

    @Override
    public void showItems(Set<Item> inStock) {
        for (Item item : inStock) {
            System.out.println(item.getSummary());
        }
    }

    @Override
    public Map<String, String> chooseFilters(Set<Item> inStock) {
        Map<String, String> query = new LinkedHashMap<>();

        System.out.print("""
                Введите через запятую фильтры поиска или "все" для вывода полного ассортимента ноутбуков:
                1 - производитель (бренд)
                2 - Операционная система
                3 - Объем жесткого диска (HDD)
                4 - объем оперативной памяти (ROM)
                5 - размер экрана по диагонали в дюймах
                6 - разрешение экрана (HD, FullHD, UHD, 4K)
                7 - Рекомендуемое применение - для офиса, для дома, для игр и программирования
                >>>""");
        String input = scanner.nextLine();
        String[] digits = input.replaceAll(" ", "").split(",");

        for (String digit : digits) {
            switch (digit) {
                case "1" -> query.put("brand", chooseBrand());
                case "2" -> query.put("os", chooseOS());
                case "3" -> query.put("hdd", chooseHdd());
                case "4" -> query.put("rom", chooseROM());
                case "5" -> query.put("screen", chooseScreen());
                case "6" -> query.put("resolution", chooseResolution());
                case "7" -> query.put("target", chooseTarget());
                case "все" -> showItems(inStock);
            }
        }
        return query;
    }

    @Override
    public Set<Item> filterItems(Set<Item> items, Map<String, String> queryFromUser) {
        Set<Item> filteredSet = new HashSet<>(items);
        for (Item item : items) {
            for (String filter : queryFromUser.values()) {
                if (!item.getSummary().contains(filter)) {
                    filteredSet.remove(item);
                }
            }
        }
        return filteredSet;
    }

    //    Методы для выбора конкретных значений фильтров
    private String chooseTarget() {
        System.out.println("""
                Выберите назначение ноутбука:
                1 - для офиса
                2 - для дома
                3 - для игр и программирования""");
        switch (scanner.nextLine()) {
            case "1" -> {
                return "для офиса";
            }
            case "2" -> {
                return "для дома";
            }
            case "3" -> {
                return "для игр и программирования";
            }
        }
        return null;
    }

    private String chooseResolution() {
        System.out.println("""
                Выберите разрешение экрана: HD, FullHD, UHD, 4K
                >>>""");
        return scanner.nextLine();
    }

    private String chooseScreen() {
        System.out.println("""
                Выберите размер экрана по диагонали в дюймах: 13, 14, 15, 17, 19
                >>>""");
        return scanner.nextLine();
    }

    private String chooseROM() {
        System.out.println("""
                Выберите объем оперативной памяти (Гб): 4, 8, 16, 32
                >>>""");
        return scanner.nextLine();
    }

    private String chooseHdd() {
        System.out.println("""
                Выберите объем жесткого диска (HDD), Гб: 256, 512, 1024, 2048
                >>>""");
        return scanner.nextLine();
    }

    private String chooseOS() {
        List<String> oSys = new LinkedList<>(List.of(
                "Windows 10 Home", "Windows 10 Pro", "Windows 10 Ultra",
                "Windows 11 Home", "Windows 11 Pro", "Windows 11 Ultra"));
        System.out.println("Выберите операционную систему:");
        for (String os : oSys)
            System.out.printf("%d - %s\n", oSys.indexOf(os), os);
        return oSys.get(Integer.parseInt(scanner.nextLine()));
    }

    private String chooseBrand() {
        System.out.println("""
                Выберите производителя:
                "Acer", "Samsung", "Dell", "Asus", "Hewlett-Packard", "Xiaomi", "BQ"
                >>>""");
        return scanner.nextLine();
    }

}
