package seminar4;

public class Cat extends Animal{
    private String name;

    public Cat(String type, String areaOfLiving, boolean isMammal, String name) {
        super(type, areaOfLiving, isMammal);
        this.name = name;
    }

    public Cat(String name) {
        this("Home pets", "home", true, name);
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println("My name is " + name);
    }
}
