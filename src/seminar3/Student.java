package seminar3;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private double averageMark;

    public Student(String firstName, String lastName, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
    }

    // region getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
    // endregion getters and setters


    @Override
    public String toString() {
        return String.format("""
                \nИмя: %10s, \tфамилия: %10s, \tсредний балл: %.2f""", firstName, lastName, averageMark);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.averageMark, averageMark) == 0 && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, averageMark);
    }
}
