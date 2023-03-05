package lab4;

    public class Cylinder extends Cirlce {
    private double h;
    public Cylinder (double r, String color, double h){
        super( r, color);
        this.h=h;
    }
    public double getH() {
        return this.h;
    }
    public void setH(double h) {
        this.h = h;
    }
    public double getVolume(){
        return getArea()*this.h;
    } 
}

