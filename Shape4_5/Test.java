package Shape4_5;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1);
//CIRCLE
        Circle c1 = new Circle(2,"green",true);
        Circle c2 = new Circle(2);
        System.out.println(c2);
        System.out.println(c1);
        System.out.println(" The color of the circle is: " + c1.getColor());
        System.out.println(" The radius is: " + c1.getRadius());
        System.out.println(" The area is: " + c1.getArea());
        System.out.println(" The perimeter is: " + c1.getPerimeter());
        c1.setRadius(5);
        System.out.println(c1);


//RECTANGLE
        Rectangle s3 = new Rectangle(3,4,"orange",true);
        System.out.println(s3);
        System.out.println(" The color of the rectangle is: " + s3.getColor());
        System.out.println(" The width is: " + s3.getWidth());
        System.out.println(" The length is: " + s3.getLength());
        System.out.println(" The area is: " + s3.getArea());
        System.out.println(" The perimeter is: " + s3.getPerimeter());

        s3.setWidth(5);
        s3.setLength(8);
        System.out.println(s3);

//SQUARE
       Square s4 = new Square(8,"blue",true);
       System.out.println(s4);
       System.out.println(" The color of the square is: " + s4.getColor());
       System.out.println(" The side is : " + s4.getSide());
       System.out.println(" The area is: " + s4.getArea());
       System.out.println(" The perimeter is: " + s4.getPerimeter());

       s4.setSide(6);
       System.out.println(s4);








    }
}
