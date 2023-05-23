
package bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        quanlyKH a = new quanlyKH();
        khachhang kh;
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("-----MENU----\n" +
                    "1.Them hoa don\n" +
                    "2.Xuat hoa don\n" +
                    "3.Tong so luong hoa don \n" +
                    "4.Tien trung binh cac hoa don khach nuoc ngoai\n" +
                    "5.Xuat cac hoa don ngay hom nay\n" +
                    "0.Thoat\n");
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if(luachon == 1){
                System.out.printf("1.Them hoa don KH VN\n" +
                        "2.Them hoa don KH nuoc ngoai\n" +
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if(i == 1){
                    kh = new khachhangVN();
                    a.themGD(kh);
                } else if (i == 2) {
                    kh = new khachhangNN();
                    a.themGD(kh);
                }
            } else if (luachon == 2) {
                a.xuatDS();
            } else if (luachon == 3) {
                System.out.printf("Nhap loai can dem: ");
                sc.nextLine();
                String loai = sc.nextLine();
                System.out.println("So luong la: "+a.demSoLuong(loai));
            }else if (luachon == 4){
                System.out.println("Tong thanh tien la"+ a.tinhTBThanhTien());
            }else if (luachon == 5){
                a.xuatGDNow();
            }
        }while (luachon != 0);
    }
}
