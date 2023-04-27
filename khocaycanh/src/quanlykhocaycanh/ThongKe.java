package quanlykhocaycanh;

import java.util.Scanner;

public class ThongKe extends CayCanh {

    private double soluonghaohut, soluongconlai;

    public ThongKe(String MaCC, String tencay, String phanloai, int soluong, int ngay, int thang, int nam, double gia) {
        super(MaCC, tencay, phanloai, soluong, ngay, thang, nam, gia);
    }

    public ThongKe() {
        super();
    }

    public double getSoluonghaohut() {
        return soluonghaohut;
    }

    public void setSoluonghaohut(int soluonghaohut) {
        this.soluonghaohut = soluonghaohut;
    }

    public double getSoluongconlai() {
        return soluongconlai;
    }

    public void setSoluongconlai(int soluongconlai) {
        this.soluongconlai = soluongconlai;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so luong cay hao hut: ");
        soluonghaohut = input.nextInt();
        soluongconlai = soluong - soluonghaohut;
        System.out.println("so luong cay con lai : " + soluongconlai);
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("| so luong hao hut : " + getSoluonghaohut()
                + "| so luong con lai : " + getSoluongconlai() + "|");
    }
}
