package Bai1b;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<HangThucPham> tps;

    public QuanLy() {
        tps = new ArrayList<>();
    }

    public void them(HangThucPham tp) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i + ": ");
            tp = new HangThucPham();
            tp.nhap();
            tps.add(tp);
        }
    }


    public void xuatDS() {
        System.out.format("%-20s %-20s %-30s %-30s %-30s %-30s\n",
                "Ma hang",
                "Ten hang",
                "Don gia",
                "Ngay san xuat",
                "Ngay het han",
                "Ghi chu");
        System.out.println("===============================================================================================================================================================");
        for (HangThucPham tp : tps) {
            if (tp.ktHSD()) {
                System.out.format("%-20s %-20s %-30.2f %-30s %-30s %-30s\n",
                        tp.getMaHang(),
                        tp.getTenHang(),
                        tp.getDonGia(),
                        tp.getNgaySanXuat(),
                        tp.getNgayHetHan(),
                        "Hang het han"
                );
            } else {
                System.out.format("%-20s %-20s %-30.2f %-30s %-30s\n",
                        tp.getMaHang(),
                        tp.getTenHang(),
                        tp.getDonGia(),
                        tp.getNgaySanXuat(),
                        tp.getNgayHetHan()
                        );
            }
        }
    }

    public void menu() {
        System.out.printf("-----QUAN LY KHO-----\n" +
                "1. Nhap thong tin\n" +
                "2. Xuat ban ke khai\n" +
                "3. Thoat\n");
    }

}
