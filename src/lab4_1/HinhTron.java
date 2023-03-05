package lab4_1;

public class HinhTron extends HinhHoc {
     public final float PI = 3.14f;
    public String Ten;
    public float DienTich;
    public float ChuVi;
    public float TheTich;
    public HinhTron(){       
        
    }
    public void XuatTen (){
        System.out.println("Hinh"+Ten);
    }
    public void InChuVi(){
        System.out.println("Chu Vi = "+ChuVi);
    }
    public void InDienTich (){
        System.out.println("Dien Tich = "+DienTich);
    }
    public void InTheTich (){
        System.out.println("The Tich = "+TheTich);
    }
    public void NhapBanKinh() {
    }
    public void TinhDienTich() {
    }
    public void TinhChuVi() {
    }
}

