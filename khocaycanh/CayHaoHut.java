package khocaycanh;
public class CayHaoHut extends CayCanh{
    
    private int NgayKiemTra ;
    private int SoLuongHaoHut ;
    private int SoLuongConLai ;

    public CayHaoHut(String MaCC, String TenCay, String PhanLoai, int SoLuong) {
       super(MaCC, TenCay, PhanLoai, SoLuong);
    }
    public CayHaoHut(){
    }
  
    public int getSoLuongHaoHut() {
        return SoLuongHaoHut;
    }

    public void setSoLuongHaoHut(int SoLuongHaoHut) {
        this.SoLuongHaoHut = SoLuongHaoHut;
    }

    public int getSoLuongConLai() {
        return SoLuongConLai;
    }

    public void setSoLuongConLai(int SoLuongConLai) {
        this.SoLuongConLai = SoLuongConLai;
    }

    public int getNgaykiemtra() {
        return NgayKiemTra;
    }

    public void setNgaykiemtra(int NgayKiemTra) {
        this.NgayKiemTra = NgayKiemTra;
    }    
     public void NhapCayHaoHut()
    {
        NhapCayCanh();
        System.out.println("nhap vao so luong cay hao hut : ");
        SoLuongHaoHut = input.nextInt(); 
        SoLuongConLai = SoLuong - SoLuongHaoHut;
        System.out.println("so luong cay con lai : "+SoLuongConLai);
     }
    public void XuatCayHaoHut()
    {
        super.XuatCayCanh();
        System.out.println("{ so luong hao hut : "+ getSoLuongHaoHut ()+
                 " ,so luong con lai : "+ getSoLuongConLai ()+"}") ;     
    }
}