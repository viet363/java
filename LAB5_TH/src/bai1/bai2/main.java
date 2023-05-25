package bai2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        quanly a = new quanly();
        khachhang khachHang;
        a.laydulieu();
        Scanner input = new Scanner(System.in);
        int n = 0;
        do {
            System.out.printf("------QUAN LY-------\n"
                    + "1.Them mot khach hang vao hang doi mua ve\n"
                    + "2.Ban mot ve cho khach hang\n"
                    + "3.Hien thi danh sach khach hang\n"
                    + "4.Xoa mot khach hang ra khoi danh sach\n"
                    + "5.Thong ke\n"
                    + "6.Luu danh sach vao file\n"
                    + "7.Hien thi cac ga dang cho mua ve\n"
                    + "0.Thoat khoi chuong trinh\n");
            System.out.print("Nhap lua chon: ");
            n = input.nextInt();
            input.nextLine();
            switch (n) {
                case 1:
                    khachHang = new khachhang();
                    a.themKhachHang(khachHang);
                    break;
                case 2:
                    System.out.print("Nhap CMND khach hang: ");
                    String cmndBanVe = input.nextLine();
                    a.banVe(cmndBanVe);
                    break;
                case 3:
                    a.hienThiDanhSachKhachHang();
                    break;
                case 4:
                    System.out.print("Nhap CMND khach hang: ");
                    String cmndHuy = input.nextLine();
                    a.huyKhachHang(cmndHuy);
                    break;
                case 5:
                    a.thongKe();
                    break;
                case 6:
                    System.out.print("Nhap ten file: ");
                    String tenFile = input.nextLine();
                    a.luuDanhSachVaoFile(tenFile);
                    break;
                case 7:
                    a.hienThiCacGaChoMuaVe();
                    break;
                case 0:
                    break;
                    default:
            }
        } while (n != 0);
    }
}

