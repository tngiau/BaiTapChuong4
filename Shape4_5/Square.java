package Shape4_5;

public class Square extends Rectangle {
    private double side ;
    public Square(){
        super(1,1);
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side, side ,color,filled);
        this.side = side;


    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);

    }

    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }


    public String toString(){
        return "Square [ "+super.toString()+" ,width = "+side+" ,height =" + side + " ]";
    }






}
