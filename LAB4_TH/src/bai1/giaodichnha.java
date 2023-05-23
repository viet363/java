package bai1;

import java.time.LocalDate;
import java.util.Scanner;

public class giaodichNha extends giaodich {

    private String loainha, diachi;

    public giaodichNha() {

    }

    public giaodichNha(String loaidat, String diachi) {
        this.loainha = loaidat;
        this.diachi = diachi;
    }

    public giaodichNha(String loainha, String diachi, String maGD, LocalDate ngaygiaodich, double dongia, double dientich) {
        super(maGD, ngaygiaodich, dongia, dientich);
        this.loainha = loainha;
        this.diachi = diachi;
    }

    public String getLoainha() {
        return loainha;
    }

    public String getDiachi() {
        return diachi;
    }

    public double getDongia() {
        return dongia;
    }

    public double getDientich() {
        return dientich;
    }

    public double thanhtien() {
        double thanhtien;
        if (loainha == "cao cap") {
            return thanhtien = dientich * dongia;
        } else {
            return thanhtien = dientich * dongia*0.9;
        }
    }

    public void nhap() {
        super.nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap loai nha:");
         loainha= input.nextLine();
         System.out.println("Nhap dia chi:");
         diachi=input.nextLine();
    }
}
