package seminar6.SOLID.MVCsample002.model;

public class StudentBuilder {
    public static StudentBuilder instance;
    private Student student;

    public static StudentBuilder getInstance() {
        if (instance == null) {
            instance = new StudentBuilder();
        }
        instance.student = new Student();
        return instance;
    }

    public Student build() {
        return this.student;
    }

    public StudentBuilder setName(String name) {
       student.setName(name);
       return this;
    }

    public StudentBuilder setSex(String sex) {
        student.setSex(sex);
        return this;
    }

    public StudentBuilder setAge(int age) {
        student.setAge(age);
        return this;
    }

    public StudentBuilder setFaculty(String faculty) {
        student.setFaculty(faculty);
        return this;
    }

    public StudentBuilder setGroup(String group) {
        student.setGroup(group);
        return this;
    }
}
