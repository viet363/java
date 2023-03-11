package cau2;

public class Square extends Rectangle {
    private double side;

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
        
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "{" +" side='" + getSide() + "'" + "}";
    }

}

