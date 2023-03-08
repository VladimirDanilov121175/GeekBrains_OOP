package seminar5.Ex001_Builder;

public class Worker {
    private String name;
    private int salary;
    private int age;
    private String department;
    private String specialization;
    private String sex;
    private boolean isOnVacation;

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }


    public String getSex() {
        return sex;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setOnVacation(boolean onVacation) {
        isOnVacation = onVacation;
    }

    public boolean isOnVacation() {
        return isOnVacation;
    }

    //endregion


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", specialization='" + specialization + '\'' +
                ", sex='" + sex + '\'' +
                ", isOnVacation=" + isOnVacation +
                '}';
    }
}
