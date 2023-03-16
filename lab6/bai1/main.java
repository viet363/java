package lab6.bai1;

    public class main {
    public static void main(String[] args) {
        NhanVien nv=new NhanVien();
        nv.XuatThongTin();
        nv =new NhanVienFulltime("a",3, 6);
        nv.XuatThongTin();
        nv=new NhanVienParttime("b", 18);
        nv.XuatThongTin();
    }
}
