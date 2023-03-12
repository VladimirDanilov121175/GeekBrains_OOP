package homework6.model.doughnuts;


import homework6.service.DoughnutInterface;

public class AlmondDoughnut implements DoughnutInterface {
    @Override
    public void eat() {
        System.out.println("You're eating an almond doughnut!");
    }
}
