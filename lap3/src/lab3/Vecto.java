package lab3;
    import java.util.TooManyListenersException;
    import java.util.Scanner;
    import java .util.Objects;
public class Vecto  {
    private double x;
    private double y;
    private double z;

    public Vecto() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vecto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vecto cong(Vecto a) {
        double newx = this.x + a.x;
        double newy = this.y + a.y;
        double newz = this.z + a.z;
        return new Vecto(
                newx, newy, newz);
    }

    public Vecto tru(Vecto a) {
        double newx = this.x - a.x;
        double newy = this.y - a.y;
        double newz = this.z - a.z;
        return new Vecto(newx, newy, newz);
    }

    public Vecto nhanHangSo(double a) {
        double newx = this.x * a;
        double newy = this.y * a;
        double newz = this.z * a;
        return new Vecto(newx, newy, newz);
    }

    public double nhanVoHuong(Vecto a) {
        return this.x * a.x + this.y * a.y + this.z * a.z;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "{" +
                " x='" + getX() + "'" +
                ", y='" + getY() + "'" +
                ", z='" + getZ() + "'" +
                "}";
    }    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Vecto vta=new Vecto(3,6,3);
        Vecto vtb=new Vecto(18,3,3);
        System.out.println("tong hai vecto la");
        System.out.println(vta.cong(vtb));
        System.out.println("hieu hai vecto la"); 
        System.out.println(vta.tru(vtb));
        System.out.println("tich hai vecto la");
        System.out.println(vta.nhanVoHuong(vtb));
        System.out.println("tich co huong cua  vecto la");
        System.out.println(vta.nhanHangSo(6));
    }
}