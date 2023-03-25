package lab5.cau1;

import lab5.cau1.QuanLyXe;
import java.util.Scanner;

public class XeNoiThanh extends QuanLyXe {

    private int sochuyen;
    private float sokmdi;
   
 public XeNoiThanh(String MaSoChuyen, String HoTen, String SoXe, long DoanhThu) {
        super(MaSoChuyen, HoTen, SoXe, DoanhThu);
    }
    
    public int getSochuyen() {
        return sochuyen;
    }

    public void setSochuyen(int sochuyen) {
        this.sochuyen = sochuyen;
    }

    public float getSokmdi() {
        return sokmdi;
    }

    public void setSokmdi(float sokmdi) {
        this.sokmdi = sokmdi;
    }
    public void Nhap(){
        Scanner input=new Scanner(System.in);
        System.out.println("ma so chuyen: ");
        System.out.println("ho ten tai xe :");
        System.out.println("So xe:");
        System.out.println("Doanh thu:");
        System.out.println("so km da di: ");
    }
   public void  Xuat(){
       System.out.println("Ma so chuyen"+getMaSoChuyen()+"Ten tai xe"+getHoTen()+"So xe"+getSoXe()+
               "Doanh thu"+getDoanhThu()+"so km da di "+getSokmdi());
   }
}
