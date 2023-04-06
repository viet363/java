package lab7.bai1;
public class XeOto extends PhuongTienDiChuyen{
    String loaiNhienLieu;

    public XeOto(String loaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    double layVanToc() {
        return 60;
    }
}