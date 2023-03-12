package homework6.model.doughnuts;

import homework6.model.DoughnutFactory;
import homework6.service.DoughnutInterface;
import homework6.service.Fill;

import java.util.Random;

public class RandomDoughnut {

    public void eatRandomDoughnut(DoughnutFactory factory) {

        DoughnutInterface randomDoughnut = getRandomDoughnut(factory);

        System.out.println("What a surprise!");
        randomDoughnut.eat();
    }

    public static DoughnutInterface getRandomDoughnut(DoughnutFactory factory) {
        Random random = new Random();
        Fill randomFill = Fill.values()[random.nextInt(Fill.values().length)];
        return factory.getDoughnut(randomFill);
    }

}
