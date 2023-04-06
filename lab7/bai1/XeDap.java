package lab7.bai1;
public class XeDap extends PhuongTienDiChuyen{
    public XeDap(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
    }

    @Override
    double layVanToc() {
        return 10;
    }

}
