package Bai1b;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HangThucPham tp = new HangThucPham();
        QuanLy a = new QuanLy();
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        do{
            a.menu();
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if(luachon == 1){
                a.them(tp);
            }else if( luachon ==2 ) {
                a.xuatDS();
            }
        }while(luachon != 0);
    }
}

