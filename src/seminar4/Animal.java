package seminar4;

public abstract class Animal implements AnimalBehaviour{
    protected String type;
    protected String areaOfLiving;
    protected boolean isMammal;

    public Animal(String type, String areaOfLiving, boolean isMammal) {
        this.type = type;
        this.areaOfLiving = areaOfLiving;
        this.isMammal = isMammal;
    }

    public String getType() {
        return type;
    }

    public String getAreaOfLiving() {
        return areaOfLiving;
    }

    public boolean isMammal() {
        return isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", areaOfLiving='" + areaOfLiving + '\'' +
                ", isMammal=" + isMammal +
                '}';
    }

    @Override
    public void sayHi() {
        System.out.printf("""
                Hi, I'm a %s. Here is info about me:
                """, this.getClass().getSimpleName());
        System.out.println(this);
    }
}
