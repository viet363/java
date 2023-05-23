package bai2;
import java.util.Scanner;
import java.time.LocalDate;
public class khachhangNN extends khachhang{
    private  String quoctich;
    private int soluong;
    private double dongia;
    public  khachhangNN(){
        
    }

    public khachhangNN(String quoctich, int soluong, double dongia) {
        this.quoctich = quoctich;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public khachhangNN(String quoctich, int soluong, double dongia, String makh, String hoten, LocalDate ngayxuatHD) {
        super(makh, hoten, ngayxuatHD);
        this.quoctich = quoctich;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    public double thanhtien() {
        return soluong * dongia;
    }

    @Override
    public String toString() {
        return "khachhangNN{" + "quoctich=" + quoctich + ", soluong=" + soluong + ", dongia=" + dongia + '}';
    }
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap quoc tich:");
        quoctich=input.nextLine();
        System.out.println("Nhap so luong:");
        soluong=input.nextInt();
        System.out.println("Nhap don gia:");
        dongia=input.nextDouble();
    }
}
