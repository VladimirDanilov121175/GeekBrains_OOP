package homework6.SOLID.MVCsample002.model;

public class Student extends User{
    private String group;
    private String faculty;

    public Student() {
        super();

    }

    public Student(String name, String sex, int age, String faculty, String group) {
        super(name, sex, age);
        this.setGroup(group);
        this.setFaculty(faculty);
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("""
                         faculty: %s, group: %s
                         """, this.getFaculty(), this.getGroup());
    }

    //region getters and setters
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    //endregion
}
