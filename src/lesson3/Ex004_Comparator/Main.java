package lesson3.Ex004_Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Worker> db = new ArrayList<>();

        // region Creating workers randomly
        for (int i = 0; i < 5; i++) {
            db.add(new Worker(
                    "FirstName" + i, "LastName" + i, rand.nextInt(18, 50), rand.nextInt(10_000)));
        }
        // endregion Creating workers randomly

        System.out.println(db);

        // region Demo Comparable
        Collections.sort(db);  // в классе Worker заложено сравнение по возрасту
        System.out.println(db);
        // endregion Demo Comparable

        // region Demo Comparator
        db.sort(new SalaryComparator());
        System.out.println(db);
        // endregion Demo Comparator

        // region Demo Sort by lambda
        // Данный способ не требует вообще применения интерфейса Comparator в классах
        db.sort((w1, w2) -> Integer.compare(w1.age, w2.age));
        System.out.println(db);
        // endregion Demo Sort by lambda
    }
}
