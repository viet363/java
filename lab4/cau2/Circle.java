package cau2;

import cau2.Shape;

public class Circle extends Shape {
    private double radius = 1.0;
    final double PI = 3.14;


    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return this.PI;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public String toString() {
        return "{" + " radius='" + getRadius() + "'" + ", PI='" + getPI() + "'" +  "}";
    }

}

