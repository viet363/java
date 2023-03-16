package khocaycanh;

import java.util.Scanner;
import java.io.Serializable;

public class CayCanh implements Serializable {

    Scanner input = new Scanner(System.in);
    String MaCC;
    private String TenCay, PhanLoai;
    int SoLuong;
    public CayCanh(String MaCC, String TenCay, String PhanLoai, int SoLuong) {
        this.TenCay = TenCay;
        this.PhanLoai = PhanLoai;
        this.MaCC = MaCC;
        this.SoLuong = SoLuong;
    }

    CayCanh() {
    }
    public String getTenCay() {
        return TenCay;
    }

    public void settencay(String TenCay) {
        this.TenCay = TenCay;
    }

    public String getPhanLoai() {
        return PhanLoai;
    }

    public void setPhanLoai(String phanloai) {
        this.PhanLoai = PhanLoai;
    }

    public String getMaCC() {
        return MaCC;
    }

    public void setMaCC(String MaCC) {
        this.MaCC = MaCC;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void NhapCayCanh() {
        System.out.println("nhap ten cay:");
        TenCay = input.nextLine();
        System.out.println("nhap loai cay:");
        PhanLoai = input.nextLine();
        System.out.println("nhap ma cay:");
        MaCC = input.nextLine();
        System.out.println("Nhap so luong cay ");
        SoLuong = input.nextInt();
    }

    public void XuatCayCanh() {
        System.out.println("{ MaCC: " + getMaCC() + ",tencay: " + getTenCay() + ", phanloai: " + getPhanLoai() + ", soluong: " + getSoLuong() + "}");
    }
}