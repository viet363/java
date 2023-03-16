package lab4.bai2;

public class HocSinh {
    public String hoTen;
    public String lop;
    public float toan;
    public float ly;
    public float hoa;

    public HocSinh(String hoTen, String lop, float toan, float ly, float hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    float DiemTrungBinh(){
        return (toan+ly+hoa)/3;
    }
}
