package khocaycanh;
        import java.util.Scanner;
        import java.io.Serializable;
public class khachhang implements Serializable {
private String  tenKH, diachiKH;
private int MaKH, dienthoaiKH;
public khachhang() {
}
public khachhang(int MaKH,int dienthoaiKH, String tenKH, String diachiKH)
 {
this.MaKH =MaKH;
this.dienthoaiKH = dienthoaiKH;
this. tenKH =  tenKH;
this. diachiKH =  diachiKH;
}
public int getMaKH() {
return MaKH;
}
public void setMaKH(int MaNCC) {
this.MaKH = MaKH;
}
public String gettenKH() {
return tenKH;
}
public void settenKH(String tenNCC) {
this.tenKH = tenKH;
}
public String getdiachiKH() {
return diachiKH;
}
public int getdienthoaiKH() {
return dienthoaiKH;
}
public void setdienthoaiKH(int dienthoaiKH) {
this.dienthoaiKH = dienthoaiKH;
}
public void nhapkhachhang() {
Scanner input = new Scanner(System.in);
System.out.println("Nhap ma nha cung cap: ");
MaKH = input.nextInt();
System.out.print("Nhap ten khach hang : ");
tenKH = input.nextLine();
System.out.print("Nhap dia chi khach hang: ");
diachiKH= input.nextLine();
System.out.print("Nhap so dien thoai khach hang: ");
dienthoaiKH = input.nextInt();
}
public void xuatnhacungcap()
    {
    System.out.println("Ma nha khach hang : "+ getMaKH()+ ", Ten nha khach hang: "+
    gettenKH()+ ", Dia chi cua khach hang  : "+ getdiachiKH()+ "So dien thoai cua khach hang "+
    getdienthoaiKH());
    }
}
