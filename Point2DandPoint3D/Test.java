package Point2DandPoint3D;

public class Test {
    public static void main(String[] args) {
        Point2D d1 = new Point2D(5.4f,5.6f);
        System.out.println(d1);

        Point3D d2 = new Point3D(4.5f,4.6f,4.7f);
        System.out.println(d2);

        d2.setX(6f);
        System.out.println(d2);
        d2.setY(7f);
        System.out.println(d2);
        d2.setZ(8f);
        System.out.println(d2);
        d2.setXYZ(6f,7f,8f);
        System.out.println(d2);

    }
}
