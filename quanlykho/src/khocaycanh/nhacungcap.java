package khocaycanh;
import java.util.Scanner;
import java.io.Serializable;
class nhacungcap implements Serializable{
private String  tenNCC, diachi;
private int MaNCC, dienthoai;
public nhacungcap() {
}
public nhacungcap(int MaNCC,int dienthoai, String tenNCC, String diachi,
String tenNganh, String khoiXT, float diemThi) {
this.MaNCC =MaNCC;
this.dienthoai = dienthoai;
this. tenNCC =  tenNCC;
this. diachi =  diachi;
}
public int getMaNCC() {
return MaNCC;
}
public void setMaNCC(int MaNCC) {
this.MaNCC = MaNCC;
}
public String gettenNCC() {
return tenNCC;
}
public void settenNCC(String tenNCC) {
this.tenNCC = tenNCC;
}
public String getdiachi() {
return diachi;
}
public int getdienthoai() {
return dienthoai;
}
public void setdienthoai(int dienthoai) {
this.dienthoai = dienthoai;
}
public void nhacungcap() {
Scanner input = new Scanner(System.in);
System.out.println("Nhap ma nha cung cap: ");
MaNCC = input.nextInt();
System.out.print("Nhap ten nha cung cap: ");
tenNCC = input.nextLine();
System.out.print("Nhap dia chi nha cung cap: ");
diachi= input.nextLine();
System.out.print("Nhap so dien thoai nha cung cap: ");
dienthoai = input.nextInt();
}
public void xuatnhacungcap()
    {
    System.out.println("Ma nha cung cap: "+ getMaNCC()+ ", Ten nha cung cap: "+
    gettenNCC()+ ", Dia chi : "+ getdiachi()+ "So dien thoai "+
    getdienthoai());
    }
}
