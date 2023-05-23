package bai3;

public class diemhocvien {
    private String hoTen;
    private int namSinh;
    private double diemMon1, diemMon2, diemMon3, diemMon4, diemMon5;

    public diemhocvien() {
    }

    public diemhocvien(String hoTen, int namSinh, double diemMon1, double diemMon2, double diemMon3, double diemMon4, double diemMon5) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
        this.diemMon4 = diemMon4;
        this.diemMon5 = diemMon5;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(double diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(double diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public double getDiemMon3() {
        return diemMon3;
    }

    public void setDiemMon3(double diemMon3) {
        this.diemMon3 = diemMon3;
    }

    public double getDiemMon4() {
        return diemMon4;
    }

    public void setDiemMon4(double diemMon4) {
        this.diemMon4 = diemMon4;
    }

    public double getDiemMon5() {
        return diemMon5;
    }

    public void setDiemMon5(double diemMon5) {
        this.diemMon5 = diemMon5;
    }

    public double tinhDTB() {
        return (diemMon1 + diemMon2 + diemMon3 + diemMon4 + diemMon5) / 5;
    }
}
