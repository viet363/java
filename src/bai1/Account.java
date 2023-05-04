package Bai1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    private long sotk;
    private String tentk;
    private double sotien;
    private String trangthai;
    final float laisuat = (float) 0.035; 
    Locale local = new Locale("vi", "vn");
    NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
    public Account() {
        long sotk = 999999;
        String tentk = " Chua xac dinh ";
        double sotien = 50;
        String trangthai = "";
    }
    public Account(long sotk, String tentk, double sotien, String trangthai) {
        this.sotk = sotk;
        this.tentk = tentk;
        this.sotien = sotien;
        this.trangthai = trangthai;
    }
    public long getSotk() {
        return sotk;
    }
    public void setSotk(long sotk  ) {
        if (sotk > 0 && sotk != 999999) {
            this.sotk = sotk;
        } else {
            this.sotk = 999999;
            System.out.println("So tai khoan khong hop le");
        }
    }
    public String getTentk() {
        return tentk;
    }
    public void setTentk(String tentk) {
        if (tentk != null) {
            this.tentk = tentk;
        } else {
            this.tentk = "Chua xac dinh";
            System.out.println("Ten tai khoan khong hop le");
        }
    }
    public double getSotien() {
        return sotien;
    }
    public void setSotien(double sotien) {
        if (sotien >= 50) {
            this.sotien = sotien;
        } else {
            this.sotien = 50;
            System.out.println("So tien khong hop le");
        }
    }
    public String getTrangthai() {
        return trangthai;
    }
    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    public Account (long sotk, String tentk){
        this.sotk = sotk;
        this.tentk = tentk;
        this.sotien = 50;
    }
    public void napTien(double sotien){
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien can nap: ");
        sotien = sc.nextDouble();
        if (sotien > 0) {
            this.sotien += sotien;
        } else {
            System.out.println("So tien khong hop le");
        }

    }
    public void ruttien(double sotien){
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien can rut: ");
        sotien = sc.nextDouble();
        if (sotien > 0 && sotien <= this.sotien) {
            this.sotien -= sotien;
        } else {
            System.out.println("So tien khong hop le");
        }
    }
    public void chuyenkhoan(Account account, double sotien){
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien can chuyen: ");
        sotien = sc.nextDouble();
        if (sotien > 0 && sotien <= this.sotien) {
            this.sotien -= sotien;
            account.sotien += sotien;
        } else {
            System.out.println("So tien khong hop le");
        }
    }
    public void daohan(){
        this.sotien = this.sotien + this.sotien * laisuat;
    }


    @Override
    public String toString() {
        return "[" +
            " sotk ='" + getSotk() + "'" +
            ", tentk ='" + getTentk() + "'" +
            ", sotien ='" + getSotien() + "'" +
            ", trangthai ='" + getTrangthai() + "'" +
            "]";
    }   
}