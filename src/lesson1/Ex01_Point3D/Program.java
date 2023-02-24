package lesson1.Ex01_Point3D;

public class Program {
    public static void main(String[] args) {

        Robot1 r1 = new Robot1("R1", 1);
        System.out.println(r1);
        System.out.println("--------------------------------");
        r1.powerOn();
        r1.working();
        r1.working();
        r1.working();
        r1.powerOff();

        System.out.println();

        Robot2 r2 = new Robot2("Sunny");
        System.out.println(r2);
        System.out.println("--------------------------------");

        r2.power();
        r2.working();
        r2.working();
        r2.power();
        r2.working();
    }
}
