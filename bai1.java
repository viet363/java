package lab3;

public class bai1 {
    public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(){
        this.numerator=0;
        this.denominator=1;
    }
    public Fraction(int num, int den){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator() {
        return this.numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return this.denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public Fraction (Fraction f){
        this.numerator= f.numerator;
        this.denominator= f.denominator;
    }
    public Fraction add(Fraction f){
        int newnum = this.numerator* f.denominator + this.denominator * f.numerator;
        int newden = this.denominator * f.denominator;
        return new Fraction(newnum, newden);
    } 
    public Fraction sub (Fraction f){
        int newnum = this.numerator* f.denominator + this.denominator * f.numerator;
        int newden = this.denominator * f.denominator;
        return new Fraction(newnum, newden);
    }
    public Fraction mul(Fraction f){
        int newnum = this.numerator * f.numerator;
        int newden = this.denominator * f.denominator;
        return new Fraction(newnum, newden);
    }
    public Fraction div(Fraction f){
        int newnum = this.numerator * f.numerator;
        int newden = this.denominator * f.denominator;
        return new Fraction(newnum, newden);
    }
    public int ucln (int numerator, int denominator){
        while (numerator!=denominator)
        {
            if(numerator>denominator)
                numerator=numerator-denominator;
            else 
                denominator=denominator-numerator;
        }
        return numerator;
    }
    public void reducer(){
        int i = ucln(this.numerator,this.denominator);
        this.numerator/=i;
        this.denominator/=i;
    }
    @Override
    public String toString() {
        return "{" +
            " numerator='" + getNumerator() + "'" +
            ", denominator='" + getDenominator() + "'" +
            "}";
    }
}
public class Point2D {
    private float x;
    private float y;
    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
}
public class Triangle {
    private float width;
    private float height;
    public Triangle(){
        this.width=0.0f;
        this.height=0.0f;
    }
    public Triangle (float width, float height){
        this.width=width;
        this.height=height;
    }
    public float getWidth() {
        return this.width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getHeight() {
        return this.height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "{" +
            " width='" + getWidth() + "'" +
            ", height='" + getHeight() + "'" +
            "}";
        }

    }   
}
