package seminar6.SOLID.MVCsample002.view;

import seminar6.SOLID.MVCsample002.controller.UserController;
import seminar6.SOLID.MVCsample002.model.Student;
import seminar6.SOLID.MVCsample002.model.StudentBuilder;
import seminar6.SOLID.MVCsample002.model.Teacher;
import seminar6.SOLID.MVCsample002.model.User;

public class UserView {
    public static void main(String[] args) {

        UserController controller = new UserController();

        User user1 = new Student(
                "Vladimir Danilov", "male", 47, "Foreign languages", "B427");
        User user2 = new Student("Elena", "female", 34, "Foreign languages", "A345");
        User user3 = new Teacher("Galina Petrovna", "female", 56, "History");
        User user4 = StudentBuilder.getInstance().setName("Igor Pupkin").setAge(36).build();

        controller.saveUser(user1);
        controller.saveUser(user2);
        controller.saveUser(user3);
        controller.saveUser(user4);

        controller.showUsers();
    }
}
