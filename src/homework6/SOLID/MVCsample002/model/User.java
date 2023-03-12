package homework6.SOLID.MVCsample002.model;

public abstract class User {
    protected int id;
    protected String name;
    protected String sex;
    protected int age;
    protected static int counter = 1;

    public User(String name, String sex, int age) {
        this.id = counter;
        this.name = name;
        this.sex = sex;
        this.age = age;
        counter++;
    }

    public User() {
        this.id = counter;
        counter++;
    }

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
    //endregion


    @Override
    public String toString() {
        return String.format("""
                User %d: %s, type: %s, age: %d, sex: %s,""",
                this.getId(), this.getName(), this.getClass().getSimpleName(), this.getAge(),this.getSex());
    }

}
