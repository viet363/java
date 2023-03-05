package lab4;
public class main {
    public static void main(String[] args) {
        Cirlce qv;
        qv = new Cirlce(3,"white");
        Cylinder g1= new Cylinder(6, "black", 18);
        System.out.println(g1.getVolume());
        System.out.println(qv.getArea());
    }
}

