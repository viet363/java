package bai1;

import java.util.Scanner;

public class phonghoc {

    String maphong;
    String daynha;
    double  dientich;
    int slden;

    public phonghoc(String maphong, String daynha, double dientich, int slden) {
        this.maphong = maphong;
        this.daynha = daynha;
        this.dientich = dientich;
        this.slden = slden;
    }

    public phonghoc() {

    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getDaynha() {
        return daynha;
    }

    public void setDaynha(String daynha) {
        this.daynha = daynha;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public int getSlden() {
        return slden;
    }

    public void setSlden(int slden) {
        this.slden = slden;
    }

    public boolean datchuan() {
        return true; 
    }

    public void nhap() {
        quanly q = new quanly();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma phong hoc:");
        maphong = input.nextLine();
        System.out.println("Nhap day nha:");
        daynha = input.nextLine();
        System.out.println("Nhap dien tich phong hoc:");
        dientich = input.nextFloat();
        System.out.println("Nhap so luong bong den:");
        slden = input.nextInt();
        phonghoc P = new phonghoc(maphong, daynha, dientich, slden);
        q.getListPhongHoc().add(P);
    }

    @Override
    public String toString() {
        return "phonghoc{" + "maphong=" + maphong + ", daynha=" + daynha + ", dientich=" + dientich + ", slden=" + slden + '}';
    }
}
