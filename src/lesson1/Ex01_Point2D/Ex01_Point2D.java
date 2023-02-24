package lesson1.Ex01_Point2D;

public class Ex01_Point2D {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        System.out.println(a);

        Point2D b = new Point2D(0);
        System.out.println(b);

        a.setX(25);
        var dis = Point2D.distance(a, b);
        System.out.println(dis);


    }
}
