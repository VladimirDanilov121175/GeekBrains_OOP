package lesson4.Ex002_ParametricMethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methods {

//     Например, нам нужен метод, который будет принимать какую-то коллекцию и возвращать один из элементов
//     определенным индексом. При этом неизвестно, какие типы данных будет содержать коллекция, соответственно,
//     мы не знаем, какой тип данных придется возвращать.
//     В классическом варианте пришлось бы писать кучу одинаковых методов для разных типов, например:

    public static String getElementFromStringCollection(List<String> col, int index) {
        return col.get(index);
    }

    public static Integer getElementFromIntegerCollection(List<Integer> col, int index) {
        return col.get(index);
    }

    public static Double getElementFromDoubleCollection(List<Double> col, int index) {
        return col.get(index);
    }

//    И другие. Но параметризация по заранее неизвестному типу позволяет написать всего 1 метод для всех типов
    public static <U> U getElementFromUCollection(List<U> col, int index) {
        return col.get(index);
    }

//    C мультипараметризацией все работает точно так же
    public static <T1, T2> T2 putIntoMap(T1 key, T2 value) {
        Map<T1, T2> hm = new HashMap<>();
        hm.put(key, value);
        return value;
    }
}
