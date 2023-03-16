package khocaycanh;
import java.util.Scanner;
import java.io.Serializable;
class NhaCungCap implements Serializable{
private String  TenNCC, DiaChiNCC, MaNCC;
private int DienThoaiNCC;
public NhaCungCap() {
}
public NhaCungCap(String MaNCC,int DienThoaiNCC, String TenNCC, String DiaChiNCC) {
this.MaNCC =MaNCC;
this.DienThoaiNCC = DienThoaiNCC;
this. TenNCC =  TenNCC;
this. DiaChiNCC =  DiaChiNCC;
}
public String getMaNCC() {
return MaNCC;
}
public void setMaNCC(String MaNCC) {
this.MaNCC = MaNCC;
}
public String getTenNCC() {
return TenNCC;
}
public void setTenNCC(String TenNCC) {
this.TenNCC = TenNCC;
}
public String getDiaChiNCC() {
return DiaChiNCC;
}
public int getDienThoaiNCC() {
return DienThoaiNCC;
}
public void setDienThoaiNCC(int DienThoaiNCC) {
this.DienThoaiNCC = DienThoaiNCC;
}
public void NhapNhaCungCap() {
Scanner input = new Scanner(System.in);
System.out.println("Nhap ma nha cung cap: ");
MaNCC = input.nextLine();
System.out.print("Nhap ten nha cung cap: ");
TenNCC = input.nextLine();
System.out.print("Nhap dia chi nha cung cap: ");
DiaChiNCC= input.nextLine();
System.out.print("Nhap so dien thoai nha cung cap: ");
DienThoaiNCC = input.nextInt();
}
public void XuatNhaCungCap()
    {
    System.out.println("Ma nha cung cap: "+ getMaNCC()+ ", Ten nha cung cap: "+
    getTenNCC()+ ", Dia chi : "+ getDiaChiNCC()+ "So dien thoai "+
    getDienThoaiNCC());
    }
}