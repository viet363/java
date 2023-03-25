package lab5.cau3;

import java.util.Date;

public class GiaoDich {

    private String magiaodich;
    private Date ngaygiaodich;
    private double dongia;
    private double soluong;
    private double thanhtien;

    public GiaoDich() {
    }

    public GiaoDich(String magiaodich, Date ngaygiaodich, double dongia, double soluong, double thanhtien) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public String getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public Date getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(Date ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    @Override
    public String toString() {
        return "{" + " magiaodich='" + getMagiaodich() + "'" + ", ngaygiaodich='" + getNgaygiaodich() + "'"
                + ", dongia='" + getDongia() + "'" + ", soluong='" + getSoluong() + "'" + ", thanhtien='" + getThanhtien() + "'" + "}";
    }

}
