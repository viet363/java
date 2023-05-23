package bai1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        quanlyGiaoDich a=new quanlyGiaoDich();
        giaodich gd;
        int n=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("---Menu---\n"+
                    "1.Them giao dich.\n"+
                    "2.Xuat giao dich.\n"+
                    "3.Tong so luong giao dich.\n"+
                    "4.Trung binh so tien giao dich.\n"+
                    "0.Thoat.");  
            System.out.printf("Nhap lua chon: ");
            n = input.nextInt();
            if(n == 1){
                System.out.printf("1.Them giao dich dat\n" +
                        "2.Them giao dich nha\n" +
                        "Nhap lua chon: ");
                int i = input.nextInt();
                if(i == 1){
                    gd = new giaodichDat();
                    a.themGD(gd);
                } else if (i == 2) {
                    gd = new giaodichNha();
                    a.themGD(gd);
                }
            } else if (n == 2) {
                a.xuatDS();
            } else if (n == 3) {
                System.out.printf("Nhap loai can dem: ");
                input.nextLine();
                String loai = input.nextLine();
                System.out.println("So luong la: "+a.demSL(loai));
            }else if (n == 4){
                System.out.println("Tong thanh tien la"+ a.tinhTBThanhTien());
            }
        }while (n != 0);
        }
    }

