package homework6.SOLID.MVCsample001.view;

import homework6.SOLID.MVCsample001.controller.UserController;

// Можно представить как аналог Main и определить в нем метод main, т.е. точку входа программы
public class UserView {
    public static void main(String[] args) {
        UserController controller = new UserController();

        controller.saveUser("Vladimir Danilov");
        controller.saveUser("Sergey Rozhkov");
        controller.saveUser("Tatjana Maslennikova");
    }
}
