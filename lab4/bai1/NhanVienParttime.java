package lab4.bai1;

public class NhanVienParttime  extends NhanVien{
    public int GioLamViec;

    public NhanVienParttime(String Ten,int GioLamViec) {
        this.Ten=Ten;
        this.GioLamViec = GioLamViec;
    }
    @Override
    public String LoaiNhanVien(){
        return "Nhan Vien PartTime";
    }
    @Override
    void TinhLuong(){
        
    }
    
}

    
