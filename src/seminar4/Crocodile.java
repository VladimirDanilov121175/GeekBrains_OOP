package seminar4;

public class Crocodile extends Animal{
    String friend;

    public Crocodile(String type, String areaOfLiving, boolean isMammal, String friend) {
        super(type, areaOfLiving, isMammal);
        this.friend = friend;
    }

    public Crocodile () {
        this("Reptiles", "river", false, "Cheburashka");
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println("I have a friend " + friend);
    }
}
