package lab4_1;
import java.util.Scanner;
public class HinhTru extends HinhTron{
    public float ChieuCao;
    public HinhTru(){
        ten = "Tru";
    }
    public void nhapChieuCao(){
            Scanner input=new Scanner(System.in);
        System.out.println("Nhap chieu cao = ");
        ChieuCao=input.nextFloat();
    }
    public void tinhTheTich (){
        theTich = ChieuCao * dienTich ;
    }
}
