package Bai1;

import java.util.Scanner;

public class Vehicle {

    private String TenChuXe;
    private String LoaiXe;
    private double DungTich;
    private double TriGia;

    public Vehicle(String TenChuXe, String LoaiXe, double DungTich, double TriGia) {
        this.TenChuXe = TenChuXe;
        this.LoaiXe = LoaiXe;
        this.DungTich = DungTich;
        this.TriGia = TriGia;
    }

    public Vehicle() {

    }

    public String getTenChuXe() {
        return TenChuXe;
    }

    public void setTenChuXe(String TenChuXe) {
        this.TenChuXe = TenChuXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }

    public double getDungTich() {
        return DungTich;
    }

    public void setDungTich(double DungTich) {
        this.DungTich = DungTich;
    }

    public double getTriGia() {
        return TriGia;
    }

    public void setTriGia(double TriGia) {
        this.TriGia = TriGia;
    }

    public double TinhThue() {
        if (DungTich < 100) {
            return TriGia * 0.01;
        } else if (DungTich == 100 || DungTich <= 200) {
            return TriGia * 0.03;
        } else {
            return TriGia * 0.05;
        }
    }

    public void Nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten chu xe:");
        TenChuXe = input.nextLine();
        System.out.println("Nhap loai xe:");
        LoaiXe = input.nextLine();
        System.out.println("Nhap dung tich xe:");
        DungTich = input.nextDouble();
        System.out.println("Nhap gia tri xe:");
        TriGia = input.nextDouble();
    }
    public void xuat(){
        System.out.format("%-26s %-26s %-26s %-26f %-26f\n",TenChuXe,LoaiXe,DungTich,TriGia,TinhThue());
    }
}
