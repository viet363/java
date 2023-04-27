package quanlykhocaycanh;

import java.util.Scanner;
import java.io.Serializable;

import java.io.Serializable;

public class CayCanh implements Serializable {

    String MaCC, tencay, phanloai;
    double gia;
    int ngay, thang, nam, soluong;

    public CayCanh(String MaCC, String tencay, String phanloai, int soluong, int ngay, int thang, int nam, double gia) {
        this.tencay = tencay;
        this.phanloai = phanloai;
        this.MaCC = MaCC;
        this.soluong = soluong;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.gia = gia;
    }

    public CayCanh() {
    }

    public String gettencay() {
        return tencay;
    }

    public void settencay(String tencay) {
        this.tencay = tencay;
    }

    public String getPhanloai() {
        return phanloai;
    }

    public void setPhanloai(String phanloai) {
        this.phanloai = phanloai;
    }

    public String getMaCC() {
        return MaCC;
    }

    public void setMaCC(String MaCC) {
        this.MaCC = MaCC;
    }

    public void setsoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getsoluong() {
        return soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void ThoiGian() {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Nhap thang: ");
            thang = input.nextInt();

            if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
                do {
                    System.out.println("Nhap ngay: ");
                    ngay = input.nextInt();
                    if (ngay > 31 || ngay < 0) {
                        System.out.println("nhap sai ngay!! moi nhap lai");
                    }
                } while (ngay > 31 || ngay < 0);
            }
            if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                do {
                    System.out.println("Nhap ngay: ");
                    ngay = input.nextInt();
                    if (ngay > 30 || ngay < 0) {
                        System.out.println("nhap sai ngay!! moi nhap lai");
                    }
                } while (ngay > 30 || ngay < 0);
            }
            if (thang == 2) {
                do {
                    System.out.println("Nhap ngay: ");
                    ngay = input.nextInt();
                    if (ngay > 28 || ngay < 0) {
                        System.out.println("nhap sai ngay!! moi nhap lai");
                    }
                } while (ngay > 28 || ngay < 0);
            }
            if (thang < 0 || thang > 12) {
                System.out.println("sai ngay thang!!! moi nhap lai!!!");
            }
        } while (thang < 0 || thang > 12);
        do {
            System.out.println("Nhap nam: ");
            nam = input.nextInt();
            if (nam < 2015 || nam > 2030) {
                System.out.println("sai nam!! moi nhap lai");
            }
        } while (nam < 2015 || nam > 2030);
    }

    public void Nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Ma Cay:");
        MaCC = input.nextLine();
        System.out.println("Nhap Ten Cay:");
        tencay = input.nextLine();
        System.out.println("Nhap Loai Cay:");
        phanloai = input.nextLine();
        System.out.println("Nhap So Luong Cay:");
        soluong = input.nextInt();
        System.out.println("Nhap gia cua cay:");
        gia=input.nextDouble();
        ThoiGian();
    }

    public void Xuat() {
        System.out.println("-----| Ma Cay Canh: " + getMaCC() + "|" + "| Ten Cay: " + gettencay() + "| Phan Loai: " + getPhanloai() + "| soluong: " + getsoluong()+"|Gia thanh: "+getGia() + "| Thoi gian: " + ngay + "|" + thang + "|" + nam + "|----");
    }

    public int compareTo(CayCanh o) {
        return this.tencay.compareTo(o.tencay);
    }
}
