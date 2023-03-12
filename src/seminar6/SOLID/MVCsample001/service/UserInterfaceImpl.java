package seminar6.SOLID.MVCsample001.service;

import seminar6.SOLID.MVCsample001.model.User;

import java.io.FileWriter;
import java.util.logging.Logger;

public class UserInterfaceImpl implements UserInterface{

    Logger logger = Logger.getAnonymousLogger();

    @Override
    public void saveUser(User user) {
        try (FileWriter fileWriter = new FileWriter("user.txt", true)) {
            fileWriter.write(user.toString() + "\n");

        } catch (Exception e) {
            logger.warning("Something went wrong by saving the user");
        }
    }
}
