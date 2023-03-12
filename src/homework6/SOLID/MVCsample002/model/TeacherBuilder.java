package homework6.SOLID.MVCsample002.model;

public class TeacherBuilder {
    public static TeacherBuilder instance;
    private Teacher teacher;

    public static TeacherBuilder getInstance() {
        if (instance == null) {
            instance = new TeacherBuilder();
        }
        instance.teacher = new Teacher();
        return instance;
    }

    public Teacher build() {
        return this.teacher;
    }

    public TeacherBuilder setName(String name) {
        teacher.setName(name);
        return this;
    }

    public TeacherBuilder setSex(String sex) {
        teacher.setSex(sex);
        return this;
    }

    public TeacherBuilder setAge(int age) {
        teacher.setAge(age);
        return this;
    }

    public TeacherBuilder setSubject(String subject) {
        teacher.setSubject(subject);
        return this;
    }
}
