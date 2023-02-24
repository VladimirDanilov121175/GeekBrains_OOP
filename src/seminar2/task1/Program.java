package seminar2.task1;

public class Program {
    public static void main(String[] args) {
        Actor john = new Human("John");

        System.out.println(john.getName());
        System.out.println(john.getCurrentStaus());

        john.setMakeOrder(true);
        System.out.println(john.getCurrentStaus());

        john.setTakeOrder(true);
        System.out.println(john.getCurrentStaus());
    }
}
