package lab7.bai1;
public class MayBay extends PhuongTienDiChuyen{
    String loaiNhienLieu;

    public MayBay(String loaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh(){
        System.out.println("....");
    }
    public void haCanh(){
        System.out.println("....");
    }
    @Override
    double layVanToc() {
        return 100;
    }
}
