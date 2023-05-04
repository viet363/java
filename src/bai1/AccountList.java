package Bai1;
import java.util.ArrayList;
import java.util.Scanner;
public class AccountList {
    ArrayList <Account> acc ;
    int count ;
    public AccountList() {
        acc = new ArrayList<Account>(100);
        count = 0;
    }
    public AccountList(int n){
        if (n > 0) {
            acc = new ArrayList<Account>(n);
        } else {
            acc = new ArrayList<Account>(100);
            count = 0;
        }
    }
    public void themTK(Account a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong can them :"); 
        int n = sc.nextInt();
        for (int i = 1; i<= n; i++){
            System.out.println("Lan nhap thu " + i);
            a = new Account();
            Scanner b = new Scanner(System.in);
            System.out.println("Nhap so tai khoan: ");
            long sotk = b.nextLong();
            a.setSotk(sotk);
            b.nextLine();
            System.out.println("Nhap ten tai khoan: ");
            String tentk = b.nextLine();
            a.setTentk(tentk);
            System.out.println("Nhap so tien: ");
            double sotien = b.nextDouble();
            a.setSotien(sotien);
            acc.add(a);
        }
    }
    public void timTK(long sotk) {
        for (int i = 0; i < count; i++) {
            if (acc.get(i).getSotk() == sotk) {
                System.out.println(acc.get(i).toString());
            }
        }
    }
    public void xoaTK(long sotk) {
        System.out.println("Nhap so tai khoan can xoa: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (acc.get(i).getSotk() == sotk) {
                acc.remove(i);
                count--;
                System.out.println("Da xoa thanh cong");
            }
        }
    }
    public int demTK() {
        return acc.size();
    }
    public void inTK() {
        for (Account a : acc) {
            System.out.println(a.toString());
        }
    }
    public void napTien() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap so tai khoan can nap tien: ");
        long sotk = sc.nextLong();
        System.out.println("Nhap so tien can nap: ");
        double sotien = 0;
        do {
            sotien = sc.nextDouble();
            if (sotien <= 0) {
                System.out.println("So tien khong hop le, vui long nhap lai: ");
            }
        } while (sotien <= 0);
        for (int i = 0; i < acc.size(); i++) {
            Account a = acc.get(i);
            if (a.getSotk() == sotk) {
                a.setSotien(a.getSotien() + sotien);
                System.out.println("Da nap tien thanh cong");
                System.out.println("So du tai khoan"+sotien);
            } else if (a.getSotk() != sotk) {System.out.println("Khong tim thay STK nay !");
        }

        }
        
    }
    public void rutTien(){
        Scanner c = new Scanner(System.in);
        System.out.println("Nhap so tai khoan can rut tien: ");
        long sotk = c.nextLong();
        System.out.println("Nhap so tien can rut: ");
        double sotien = 0;
        do {
            sotien = c.nextDouble();
            if (sotien <= 0) {
                System.out.println("So tien khong hop le, vui long nhap lai: ");
            }
        } while (sotien <= 0);
        for ( int i = 0; i < acc.size(); i++){
            Account a = acc.get(i);
            if (a.getSotk() == sotk){
                if (a.getSotien() >= sotien){
                    a.setSotien(a.getSotien() - sotien);
                    System.out.println("Da rut tien thanh cong");
                } else {
                    System.out.println("So tien khong du de rut");
                }
            }
            else if (a.getSotk() != sotk) {
                System.out.println("Khong tim thay STK nay !");
            }
        }
        
    }
    public void chuyenTien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan can chuyen: ");
        long sotk = sc.nextLong();
        System.out.println("Nhap so tien can chuyen: ");
        double sotien = sc.nextDouble();
        System.out.println("Nhap so tai khoan nhan: ");
        long sotknhan = sc.nextLong();
        do {
            if (sotien <= 0) {
                System.out.println("So tien khong hop le, vui long nhap lai: ");
            }
        } while (sotien <= 0);
        for ( int i = 0; i < acc.size() ; i++){
            Account a = acc.get(i);
            if (a.getSotk() == sotk){
                if (a.getSotien() >= sotien){
                    a.setSotien(a.getSotien() - sotien);
                    System.out.println("Da chuyen tien thanh cong");
                    System.out.println("So du tai khoan"+sotien);
                }
            }
        }
        for ( int i = 0; i < acc.size() ; i++){
            Account a = acc.get(i);
            if (a.getSotk() == sotknhan){
                a.setSotien(a.getSotien() + sotien);
                return;
            }
            else if (a.getSotk() != sotknhan) {
                System.out.println("Khong tim thay STK nay !");
            }
        }
       }

    public void menu(){
        System.out.println("\n--------QUAN LY TAI KHOAN--------\n"+
                        "1. Them tai khoan\n"+ 
                        "2. Xoa tai khoan\n"+
                        "3. Dem so tai khoan hien co\n"+ 
                        "4. In thong tin tai khoan\n"+ 
                        "5. Nap tien vao tai khoan\n"+ 
                        "6. Rut tien tu tai khoan\n"+ 
                        "7. Chuyen tien\n"+ 
                        "0. Thoat\n");
    }
}