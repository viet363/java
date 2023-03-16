package khocaycanh;

import java.text.SimpleDateFormat;


public class XuatCayCanh extends CayCanh{
    public XuatCayCanh(String MaCC, String TenCay, String PhanLoai, int SoLuong) {
        super(MaCC, TenCay, PhanLoai, SoLuong);
    }
    public XuatCayCanh(){
    }
    public void Nhapdsxuatcaycanh(){
        NhapCayCanh();
    }
    public void Tradsxuatcaycanh(){
      XuatCayCanh();
    }
  
    
}