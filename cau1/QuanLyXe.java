package lab5.cau1;

public class QuanLyXe {

    protected String MaSoChuyen;
    protected String HoTen;
    protected String SoXe;
    protected long DoanhThu;

    public QuanLyXe(String MaSoChuyen, String HoTen, String SoXe, long DoanhThu) {
        super();
        this.MaSoChuyen = MaSoChuyen;
        this.HoTen = HoTen;
        this.SoXe = SoXe;
        this.DoanhThu = DoanhThu;
    }

    public String getMaSoChuyen() {
        return MaSoChuyen;
    }

    public void setMaSoChuyen(String MaSoChuyen) {
        this.MaSoChuyen = MaSoChuyen;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoXe() {
        return SoXe;
    }

    public void setSoXe(String SoXe) {
        this.SoXe = SoXe;
     
    }

    public long getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(long DoanhThu) {
        this.DoanhThu = DoanhThu;
    }
    
 public void toiString(){
     System.out.println("Ma so chuyen"+getMaSoChuyen()+"Ten tai xe"+getHoTen()+"So xe"+getSoXe()+"Doanh thu"+DoanhThu());}   
}
