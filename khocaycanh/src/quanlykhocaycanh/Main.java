package quanlykhocaycanh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QuanLy a = new QuanLy();
        CayCanh b;
        CayCanh c = new CayCanh();
        int n;
        Scanner input = new Scanner(System.in);
        do {
            a.menuChinh();
            System.out.print(
                    "Lua chon: ");
            n = input.nextInt();
            switch (n) {
                case 1 -> {
                    b = new listCayThanGo();
                    a.DScay(b);
                }
                case 2 -> {
                    a.hienDSCayThanGo();
                }
                case 3 -> {

                    b = new listCayThanThao();
                    a.DScay(b);
                }
                case 4 -> {
                    a.hienDSCayThanThao();
                }
                case 5 -> {
                    b = new ThongKe();
                    a.DScay(b);
                }
                case 6 -> {
                    a.hienThongKe();
                }
                case 7 -> {
                    String tenfile;
                    System.out.print("NHAP TEN FILE: ");
                    input.nextLine();
                    tenfile = input.nextLine();
                    a.ghiFile(tenfile);
                }
                case 8 -> {
                    String tenfile;
                    System.out.print("NHAP TEN FILE: ");
                    input.nextLine();
                    tenfile = input.nextLine();
                    a.docFile(tenfile);
                }

                case 9 -> {
                    a.SuaDoi();
                }
                case 10 -> {
                    a.SapXepTheoGiaCay();
                    a.hienDSCay();
                }
                case 11 -> {
                    String MaCC;
                    System.out.println("Nhap Ma cay can tim: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    a.timkiemCayThanGo(MaCC);
                }
                case 12 -> {
                    String MaCC;
                    System.out.println("Nhap Ma cay can tim: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    a.timkiemCayThanThao(MaCC);
                }
                default -> {
                }
            }
        } while (n != 0);
    }
}
