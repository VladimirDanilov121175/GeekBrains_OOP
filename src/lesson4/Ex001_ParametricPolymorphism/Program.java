package lesson4.Ex001_ParametricPolymorphism;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {

        // region ParameterizedWorker
        ParametrizedWorker<Integer> w1 = new ParametrizedWorker<>(237, "Vladimir",
                "Danilov", 47, 20_000);

        String uid = UUID.randomUUID().toString();
        ParametrizedWorker<String> w2 = new ParametrizedWorker<>(uid, "Kolyamba",
                "Malyamba", 19, 25_000);

        System.out.print(w1);
        System.out.print(w2);
        // endregion ParameterizedWorker

        System.out.println();

        // region MultiParameterized
        MultiParametrized<Integer, Double, String> m1 = new MultiParametrized<>(10, 2.0, "3.0");
        MultiParametrized<String, String, String> m2 = new MultiParametrized<>("10", "2.0", "3.0");

        System.out.println(m1 + "\n" + m2);
        // endregion MultiParameterized
    }
}
