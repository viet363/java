package lab_4;
 import java.util.Scanner;
import java.util.Scanner;

public class SanPham {
    private String TenSp;
    private double donGia;
    private double giamGia;

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham() {
    }

    public SanPham(String TenSp, double donGia, double giamGia) {
        this.TenSp = TenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String TenSp, double donGia) {
        this(TenSp, donGia, 0);
    }

    private double getThueNhapKhau(double donGia) {
        return donGia * 0.1;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ten san pham: ");
        TenSp = sc.nextLine();
        System.out.printf("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.printf("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Ten san pham:"+TenSp+" Don Gia:" +donGia+" Giam gia: ");
    }
}

