package Point2DandPoint3D;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z=z;
    }
    public Point3D(){};

    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] xyz = new float[3];
        xyz[0]=getX();
        xyz[1]=getY();
        xyz[2]=z;
        return xyz;
    }
    public String toString(){
        return "("+super.toString()+","+z+")";
    }


}
