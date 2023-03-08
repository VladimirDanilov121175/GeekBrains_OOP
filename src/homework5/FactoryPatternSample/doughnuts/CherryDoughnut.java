package homework5.FactoryPatternSample.doughnuts;

import homework5.FactoryPatternSample.DoughnutInterface;

public class CherryDoughnut implements DoughnutInterface {
    @Override
    public void eat() {
        System.out.println("You're eating a cherry doughnut!");
    }
}
