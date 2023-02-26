package lab3;

public class hinh {
    public class Circle {
    private double r;
    public Circle() {
        this.r = 0;
    }

    public Circle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public double dienTich() {
        return Math.PI * this.r * this.r;
    }

    public double chuVi() {
        return 2 * Math.PI * this.r;
    }
    @Override
    public String toString() {
        return "{" +
            " r='" + getR() + "'" +
            "}";
    }
}
public class Square {
    private double canh;

    public Square() {
        this.canh = 0;
    }

    public Square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return this.canh;
    }

    public void setCanh(double c) {
        this.canh = c;
    }

    public double dienTich() {
        return this.canh * this.canh;
    }

    public double chuVi() {
        return 4 * this.canh;
    }
}
}
