package lesson4.Ex001_ParametricPolymorphism;

public class ParametrizedWorker<E> {
    private E id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public ParametrizedWorker(E id, String firstName, String lastName, int age, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("""
                id: %s, name: %s, age: %d, salary: %d
                """,
                this.getId(), this.fullName(), this.age, this.salary);
    }

    public String getId() {
        return String.format("%s", id);
    }
}
