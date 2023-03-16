package lab6.bai1;

public class NhanVienFulltime  extends NhanVien {
    public int LoaiChucVu;
    public int NgayLamThem;

    public NhanVienFulltime(String Ten,int LoaiChucVu, int NgayLamThem) {
        this.Ten=Ten;
        this.LoaiChucVu = LoaiChucVu;
        this.NgayLamThem = NgayLamThem;
    }
    @Override
    public String LoaiNhanVien(){
        return "NhanVienFullTime";
    }
    @Override
    public void TinhLuong(){      
    }  
} 

