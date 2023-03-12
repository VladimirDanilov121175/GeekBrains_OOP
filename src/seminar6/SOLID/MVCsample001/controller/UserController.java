package seminar6.SOLID.MVCsample001.controller;

import seminar6.SOLID.MVCsample001.model.User;
import seminar6.SOLID.MVCsample001.service.UserInterface;
import seminar6.SOLID.MVCsample001.service.UserInterfaceImpl;

public class UserController {
    private final UserInterface service = new UserInterfaceImpl();

    public void saveUser(String name) {
        service.saveUser(new User(name));
    }
}
