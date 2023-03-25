package lab5.cau1;
import lab5.cau1.QuanLyXe;
import java.util.Scanner;
public class XeNgoaiThanh extends QuanLyXe {

    private String noiden;
    private float songaydi;

    public XeNgoaiThanh(String MaSoChuyen, String HoTen, String SoXe, long DoanhThu) {
        super(MaSoChuyen, HoTen, SoXe, DoanhThu);
    }
    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public float getSongaydi() {
        return songaydi;
    }

    public void setSongaydi(float songaydi) {
        this.songaydi = songaydi;
    }
    public void Nhap(){
        Scanner input=new Scanner(System.in);
        System.out.println("ma so chuyen: ");
        MaSoChuyen=input.nextLine();
        System.out.println("ho ten tai xe: ");
        HoTen=input.nextLine();
        System.out.println("So xe:");
        SoXe=input.nextLine();
        System.out.println("Doanh thu:");
        DoanhThu=input.nextLong();
        System.out.println("noi den:");
        noiden=input.nextLine();
        System.out.println("so ngay duoc: ");
        songaydi=input.nextFloat();
        
    }
   public void  Xuat(){
       System.out.println("Ma so chuyen"+getMaSoChuyen()+"Ten tai xe"+getHoTen()+"So xe"+getSoXe()+"Doanh thu"+getDoanhThu()+"noi den"+getNoiden()
       +"so ngay di ");
   }
}

