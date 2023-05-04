package bai2;
import java.util.Scanner;

public class CDTest {
    public static void main(String[] args) {
        CDList cd = new CDList();
        CD cd1 = new CD();
        Scanner sc = new Scanner (System.in);
        int luachon = 0;
        do {
            cd.menu();
            System.out.println("Nhap lua chon cua ban: ");
            luachon = sc.nextInt();
            if (luachon == 1){
                cd.themCD(cd1);
            }
            if (luachon == 2){
                System.out.println("So CD hien co: " + cd.demCD());
            }
            if (luachon == 3){
                cd.tongGiaCD();
            }
            if (luachon == 4){
                cd.sapXepgiamtheogiathanh();
                cd.inThongTin();
            }
            if (luachon == 5){
                cd.sapXeptheotuaCD();
                cd.inThongTin();
            }
            if ( luachon == 6){
                cd.inThongTin();
            }

        }while (luachon != 0);
    }
    
}
