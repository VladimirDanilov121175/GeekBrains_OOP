package lesson3.Ex004_Comparator;

public class Worker implements Comparable<Worker> {
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

    @Override
    public int compareTo(Worker o) {
//        Integer.compare(this.salary, o.salary);

        // Классическая реализация от разработчиков Java
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;

        }
    }

    @Override
    public String toString() {
        return String.format("""
                \nName: %s, age: %d, salary: %d""", this.fullName(), this.age, this.salary);
    }
}
