package khocaycanh;
        import java.util.Scanner;
        import java.io.Serializable;
public class khachHang implements Serializable {
private String  TenKH, DiaChiKH,MaKH;
private int  DienThoaiKH;
public khachHang(String MaKH,int DienThoaiKH, String TenKH, String DiaChiKH)
 {
this.MaKH =MaKH;
this.DienThoaiKH = DienThoaiKH;
this. TenKH =  TenKH;
this. DiaChiKH =  DiaChiKH;
}
public khachHang() {
}
public String getMaKH() {
return MaKH;
}
public void setMaKH(String MaKH) {
this.MaKH = MaKH;
}
public String getTenKH() {
return TenKH;
}
public void setTenKH(String TenKH) {
this.TenKH = TenKH;
}
public String getDiaChiKH() {
return DiaChiKH;
}
public int getDienThoaiKH() {
return DienThoaiKH;
}
public void setDienThoaiKH(int dienthoaiKH) {
this.DienThoaiKH = DienThoaiKH;
}
public void NhapKhachHang() {
Scanner input = new Scanner(System.in);
System.out.println("Nhap ma nha cung cap: ");
MaKH = input.nextLine();
System.out.print("Nhap ten khach hang : ");
TenKH = input.nextLine();
System.out.print("Nhap dia chi khach hang: ");
DiaChiKH= input.nextLine();
System.out.print("Nhap so dien thoai khach hang: ");
DienThoaiKH = input.nextInt();
}
public void XuatKhachHang()
    {
    System.out.println("Ma nha khach hang : "+ getMaKH()+ ", Ten nha khach hang: "+
    getTenKH()+ ", Dia chi cua khach hang  : "+ getDiaChiKH()+ "So dien thoai cua khach hang "+
    getDienThoaiKH());
    }
}