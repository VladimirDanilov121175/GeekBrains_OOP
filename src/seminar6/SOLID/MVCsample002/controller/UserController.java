package seminar6.SOLID.MVCsample002.controller;

import seminar6.SOLID.MVCsample002.service.UserInterface;
import seminar6.SOLID.MVCsample002.service.UserInterfaceImpl;
import seminar6.SOLID.MVCsample002.model.User;

public class UserController {

    private UserInterface service = new UserInterfaceImpl();

    public void saveUser(User user) {
        service.saveUser(user);
    }

    public void showUsers() {
        service.readInfo();
    }
}
