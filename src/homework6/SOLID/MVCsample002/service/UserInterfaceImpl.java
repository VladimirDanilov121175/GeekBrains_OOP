package homework6.SOLID.MVCsample002.service;

import homework6.SOLID.MVCsample002.model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class UserInterfaceImpl implements UserInterface{

    @Override
    public void readInfo() {
        try (FileReader fileReader = new FileReader(Database.DB_PATH)) {
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error reading database: " + e.getMessage());
        }
    }

    @Override
    public void saveUser(User user) {

        try (FileWriter fileWriter = new FileWriter(Database.DB_PATH, true)) {
            fileWriter.write(user.toString());
        } catch (Exception e) {
            System.out.println("Error saving user: " + e.getMessage());
        }
    }
}
