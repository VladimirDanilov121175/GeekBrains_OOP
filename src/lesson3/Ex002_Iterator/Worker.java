package lesson3.Ex002_Iterator;

import java.util.Iterator;

public class Worker implements Iterator<String> {
    String firstName;
    String lastName;
    int age;
    int salary;

    public Worker(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    private int index;

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        return switch (index) {
            case 1 -> String.format("First name: %s", firstName);
            case 2 -> String.format("Last name: %s", lastName);
            case 3 -> String.format("Age: %d", age);
            case 4 -> String.format("Salary: %d", salary);
            default -> null;
        };
    }
}
