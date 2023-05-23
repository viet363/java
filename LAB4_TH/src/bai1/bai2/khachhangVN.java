package bai2;

import java.util.Scanner;
import java.time.LocalDate;

public class khachhangVN extends khachhang {

    private String loaiKH;
    private double dongia, dinhmuc;
    private int soluong;

    public khachhangVN() {

    }

    public khachhangVN(String loaiKH, double dongia, double dinhmuc, int soluong) {
        this.loaiKH = loaiKH;
        this.dongia = dongia;
        this.dinhmuc = dinhmuc;
        this.soluong = soluong;
    }

    public khachhangVN(String loaiKH, double dongia, double dinhmuc, int soluong, String makh, String hoten, LocalDate ngayxuatHD) {
        super(makh, hoten, ngayxuatHD);
        this.loaiKH = loaiKH;
        this.dongia = dongia;
        this.dinhmuc = dinhmuc;
        this.soluong = soluong;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(double dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public double thanhtien() {
        if (soluong <= dinhmuc) {
            return soluong * dongia;
        } else {
            double soluongvuot = soluong - dinhmuc;
            return soluong * dongia * dinhmuc + soluongvuot * dongia * 2.5;
        }
    }
    @Override
    public String toString() {
        return "khachhangVN{" + "loaiKH=" + loaiKH + ", dongia=" + dongia + ", dinhmuc=" + dinhmuc + ", soluong=" + soluong + '}';
    }

    @Override
    public void Nhap() {
        super.Nhap();
         Scanner input=new Scanner(System.in);
         System.out.println("Nhap loai khach hang (sinh hoat/kinh doanh/san xuat):");
         loaiKH=input.nextLine();
         System.out.println("Nhap don gia:");
         dongia=input.nextDouble();
         System.out.println("Nhap dinh muc:");
         dinhmuc=input.nextDouble();
         System.out.println("Nhap so luong:");
         soluong=input.nextInt();
    }
}
