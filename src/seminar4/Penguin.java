package seminar4;

public class Penguin extends Animal {

    private String color;

    public Penguin() {
        super("bird", "Antarctic", false);
        this.color = "black";
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println("my feathers are " + this.color);
    }
}
