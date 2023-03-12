package homework6.SOLID.MVCsample002.controller;

import homework6.SOLID.MVCsample002.service.UserInterface;
import homework6.SOLID.MVCsample002.service.UserInterfaceImpl;
import homework6.SOLID.MVCsample002.model.User;

public class UserController {

    private UserInterface service = new UserInterfaceImpl();

    public void saveUser(User user) {
        service.saveUser(user);
    }

    public void showUsers() {
        service.readInfo();
    }
}
