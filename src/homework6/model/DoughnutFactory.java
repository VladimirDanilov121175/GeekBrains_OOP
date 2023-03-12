package homework6.model;

import homework6.model.doughnuts.AlmondDoughnut;
import homework6.model.doughnuts.CherryDoughnut;
import homework6.model.doughnuts.ChocolateDoughnut;
import homework6.model.doughnuts.RandomDoughnut;
import homework6.service.DoughnutInterface;
import homework6.service.Fill;


public class DoughnutFactory {

    private int almondDoughnutCount;
    private int chocolateDoughnutCount;
    private int cherryDoughnutCount;

    public DoughnutInterface getDoughnut(Fill type) {

        DoughnutInterface toReturn;

        switch (type) {
            case ALMOND -> {
                almondDoughnutCount++;
                toReturn = new AlmondDoughnut();
            }
            case CHERRY -> {
                cherryDoughnutCount++;
                toReturn = new CherryDoughnut();
            }
            case CHOCOLATE -> {
                chocolateDoughnutCount++;
                toReturn = new ChocolateDoughnut();
            }
            case RANDOM_FILL -> toReturn = RandomDoughnut.getRandomDoughnut(this);
            default -> throw new IllegalArgumentException ("No such filling available: " + type);
        }
        return toReturn;
    }

    public void printCounts() {
        System.out.println("Totally produced doughnuts:");
        System.out.println("Almond doughnuts: " + almondDoughnutCount);
        System.out.println("Cherry doughnuts: " + cherryDoughnutCount);
        System.out.println("Chocolate doughnuts: " + chocolateDoughnutCount);
    }
}
