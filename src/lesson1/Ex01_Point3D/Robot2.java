package lesson1.Ex01_Point3D;

import java.util.ArrayList;

public class Robot2 {

    /** Level of the robot */
    private int level;
    /** Name of the robot */
    private String name;

    //    Нужны для предотвращения создания роботов с одинаковыми именами
    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 2;
        names = new ArrayList<String>();
    }

    /** State of the robot */
    private State state;
    enum State { ON, OFF }

    // region getters and setters
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

    // region various constructors for building robots
    private Robot2(String name, int level) {
        if (name.isEmpty()
                || Character.isDigit(name.charAt(0))
                || Robot2.names.contains(name)) {
            this.name = String.format("Robot_%d", defaultIndex++);
        } else {
            this.name = name;
        }
        this.level = level;
        this.state = State.OFF;
        Robot2.names.add(name);
    }

    public Robot2(String name) {
        this(name, 1);
    }

    public Robot2() {
        this("");
    }
//    endregion various constructors for building robots

//    Starting and stopping robot
    public void power() {
        if (this.state == State.OFF) {
            this.powerOn();
            this.state = State.ON;
        } else {
            this.powerOff();
            this.state = State.OFF;
        }
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
    public void working() {
        if (this.state == State.ON)
            System.out.println("Working hard..."); }
    private void stopBIOS() { System.out.println("Stopping BIOS..."); }
    private void stopOS() { System.out.println("Stopping OS..."); }
    private void sayBye() { System.out.println("Robot saying \"Bye!\""); }

    @Override
    public String toString() {
        return String.format("Robot %s, level %d", this.name, this.level);
    }
}
