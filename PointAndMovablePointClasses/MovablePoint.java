package PointAndMovablePointClasses;

public class MovablePoint extends Point {
    private float xSpeed ;
    private float ySpeed ;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {};
    public float getXspeed() {
        return xSpeed;
    }
    public void setXspeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYspeed() {
        return ySpeed;
    }
    public void setYspeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
       float[] speed = new float[2];
       speed[0] = xSpeed;
       speed[1] = ySpeed;
       return speed;
    }
    public String toString() {
        return "MovablePoint[" +super.toString()+ ", speed=("+xSpeed+","+ySpeed+" )]";
    }
    public MovablePoint move() {
       setX(getX() + xSpeed);
       setY(getY() + ySpeed);
        return this;
    }




}
