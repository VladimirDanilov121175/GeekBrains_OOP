package homework6.model.doughnuts;

import homework6.service.DoughnutInterface;


public class CherryDoughnut implements DoughnutInterface {
    @Override
    public void eat() {
        System.out.println("You're eating a cherry doughnut!");
    }
}
