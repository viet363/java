package bai2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class quanlyKH {

    private ArrayList<khachhang> x;

    public quanlyKH() {
        x = new ArrayList<>();
    }

    public void themGD(khachhang kh) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i);
            if (kh instanceof khachhangVN) {
                kh = new khachhangVN();
                kh.Nhap();
            } else if (kh instanceof khachhangNN) {
                kh = new khachhangNN();
                kh.Nhap();
            }
            x.add(kh);
        }
    }

    public void xuatDS() {
        for (khachhang kh : x) {
            System.out.println(kh.toString());
            System.out.println("Thanh tien: " + kh.thanhTien());
        }
    }

    public int demSoLuong(String loai) {
        int count = 0;
        for (khachhang kh : x) {
            if (kh instanceof khachhangVN && loai.equals("VN")) {
                count++;
            } else if (kh instanceof khachhangNN && loai.equals("nuoc ngoai")) {
                count++;
            }
        }
        return count;
    }

    public double tinhTBThanhTien() {
        double tongThanhTien = 0;
        int dem = 0;
        for (khachhang gd : x) {
            if (gd instanceof khachhangNN) {
                tongThanhTien += gd.thanhTien();
                dem++;
            }
        }
        if (dem != 0) {
            return tongThanhTien / dem;
        } else {
            return 0;
        }
    }

    public void xuatGDNow() {
        for (khachhang gd : x) {
            if (gd.getNgayxuatHD().equals(LocalDate.now())) {
                System.out.println(gd.toString());
                System.out.println("Thanh tien: " + gd.thanhTien());
            }
        }
    }

}

