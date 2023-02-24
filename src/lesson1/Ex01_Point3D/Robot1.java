package lesson1.Ex01_Point3D;

public class Robot1 {
    /** Level of the robot */
    private int level;

    /** Name of the robot */
    private String name;

//    region getters and setters
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    endregion getters and setters

    public Robot1(String name, int level) {
        this.level = level;
        this.name = name;
    }

    public void powerOn() {
        this.startBios();
        this.startOS();
        this.sayHi();
    }

    public void powerOff() {
        this.stopOS();
        this.stopBIOS();
        this.sayBye();
    }

    // Set of methods for behavior of the robot
    private void startBios() { System.out.println("Starting BIOS..."); }
    private void startOS() { System.out.println("Starting OS..."); }
    private void sayHi() { System.out.println("Robot saying \"Hello!\""); }
    public void working() { System.out.println("Working hard..."); }
    private void stopBIOS() { System.out.println("Stopping BIOS..."); }
    private void stopOS() { System.out.println("Stopping OS..."); }
    private void sayBye() { System.out.println("Robot saying \"Bye!\""); }

    @Override
    public String toString() {
        return String.format("Robot %s, level %d", this.name, this.level);
    }
}
