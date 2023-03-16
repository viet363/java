package lab4.bai1;


public class NhanVien {
    public String Ten;
    public long Luong;

    public NhanVien() {
    }

    public NhanVien(String Ten) {
        this.Ten = Ten;
    }
    public String LoaiNhanVien(){
        return "Nhan vVen";
    }
    void TinhLuong(){
    }
    void XuatThongTin(){
        System.out.println("ten: "+Ten+"luong: "+Luong+"loai nhan vien: "+LoaiNhanVien());
    }
    
    
    
}