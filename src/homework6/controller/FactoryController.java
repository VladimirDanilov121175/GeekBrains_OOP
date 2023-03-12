package homework6.controller;

import homework6.model.DoughnutFactory;
import homework6.service.Fill;

public class FactoryController {

    DoughnutFactory factory = new DoughnutFactory();

    public void eatDoughnut(Fill filling) {
       factory.getDoughnut(filling).eat();
    }

    public void showOrder() {
        factory.printCounts();
    }

}
