package homework6.SOLID.MVCsample002.model;

public class Teacher extends User {

    private String subject;

    public Teacher() {
    }

    public Teacher(String name, String sex, int age, String subject) {
        super(name, sex, age);
        this.setSubject(subject);
    }

    //region getters and setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    //endregion


    @Override
    public String toString() {
        return super.toString() + " subject taught: " + subject + "\n";
    }
}
