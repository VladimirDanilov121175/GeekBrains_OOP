package homework6.SOLID.MVCsample001.controller;

import homework6.SOLID.MVCsample001.model.User;
import homework6.SOLID.MVCsample001.service.UserInterface;
import homework6.SOLID.MVCsample001.service.UserInterfaceImpl;

public class UserController {
    private final UserInterface service = new UserInterfaceImpl();

    public void saveUser(String name) {
        service.saveUser(new User(name));
    }
}
