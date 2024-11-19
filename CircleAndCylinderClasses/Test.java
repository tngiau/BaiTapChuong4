package CircleAndCylinderClasses;

public class Test {
    public static void main(String[] args) {
        Circle a1 = new Circle(5,"green");
        System.out.println(a1);


        Cylinder a2 = new Cylinder();
        System.out.println(a2);
        System.out.println("Radius :" + a2.getRadius());
        System.out.println("Height : " + a2.getHeight());
        System.out.println("Color : "+ a2.getColor());
        System.out.println("Base area :" + a2.getArea());
        System.out.println("Volume :" + a2.getVolume());


        Cylinder a3 = new Cylinder(10.0);
        System.out.println("Cylinder :"
                + "radius =" + a3.getRadius()
                + "height =" + a3.getHeight()
                + "color =" + a3.getColor()
                + "area =" + a3.getArea()
                + "volume =" + a3.getVolume());

        Cylinder a4 = new Cylinder(2.0,10.0);
        System.out.println("Cylinder :"
                + "radius=" + a4.getRadius()
                + "height=" + a4.getHeight()
                + "base area=" + a4.getArea()
                + "volume=" + a4.getVolume());
    }
}
