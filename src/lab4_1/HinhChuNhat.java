package lab4_1;
import java.util.Scanner;
public class HinhChuNhat {
    public float dai;
    public float rong;
    public HinhChuNhat(){
        String ten = "Chu Nhat";
    }
    public void NhapChieuDai (){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chieu dai = ");
        dai=scanner.nextFloat();
    }
    public void NhapChieuRong(){
        System.out.println("Nhap chieu rong = ");
        Scanner scanner=new Scanner(System.in);
        rong=scanner.nextFloat();
    }
    public void tinhChuVi(){
        float ChuVi = (dai+rong)*2;
    }
    public void tinhDienTich(){
        float DienTich = dai*rong;
    }
}
