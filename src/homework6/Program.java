package homework6;

import homework6.view.App;
import homework6.view.ConsoleView;

public class Program {
    public static void main(String[] args) {

        App doughnutFactoryApp = new App(new ConsoleView());
        doughnutFactoryApp.start();
    }
}
