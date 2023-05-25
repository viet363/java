package bai2;

import java.util.Scanner;

public class khachhang {

    private String cmnd;
    private String ten;
    private String gaden;
    private double giatien;

    public khachhang(String cmnd, String ten, String gaden, double giatien) {
        this.cmnd = cmnd;
        this.ten = ten;
        this.gaden = gaden;
        this.giatien = giatien;
    }

    public khachhang() {
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGaden() {
        return gaden;
    }

    public void setGaden(String gaden) {
        this.gaden = gaden;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cmnd khach hang: ");
        cmnd = sc.nextLine();
        System.out.print("Nhap ten khach hang: ");
        ten = sc.nextLine();
        System.out.print("Nhap ga den : ");
        gaden = sc.nextLine();
        System.out.print("Nhap gia tien: ");
        giatien = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "khachhang{" + "cmnd=" + cmnd + ", ten=" + ten + ", gaden=" + gaden + ", giatien=" + giatien + '}';
    }

    
}
