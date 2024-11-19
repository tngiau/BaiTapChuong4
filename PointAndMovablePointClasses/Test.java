package PointAndMovablePointClasses;

public class Test {
    public static void main(String[] args) {

// testPoint

        Point f4 = new Point(2.6f,3.6f);
        System.out.println(f4);
        f4.setX(9f);
        f4.setY(9f);
        System.out.println(f4);
        float[] result;
        result = new float[2];
        result[0] = 6f;
        result[1] = 7f;
        System.out.println(result[0]);
        System.out.println(result[1]);

// testMovablePoint
        Point f5 = new MovablePoint(2.4f,3.4f);
        System.out.println(f5);

        MovablePoint f6 = new MovablePoint(4f,5.f,2.6f,3.4f);
        System.out.println(f6);

        System.out.println("xspeed is:"+ f6.getXspeed());
        System.out.println("yspeed is:"+ f6.getYspeed());

        f6.setXspeed(3f);
        f6.setYspeed(4f);
        System.out.println(f5);

        f6.setSpeed(5.5f,6.5f);
        System.out.println(f5);

        float[] speed = new float[2];
        speed[0] = 2f;
        speed[1] = 4f;
        System.out.println(speed[0]);
        System.out.println(speed[1]);







    }
}
