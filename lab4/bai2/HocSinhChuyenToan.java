package lab4.bai2;

    public class HocSinhChuyenToan extends HocSinh{

    public HocSinhChuyenToan(String hoTen, String lop, float toan, float ly, float hoa) {
        super(hoTen, lop, toan, ly, hoa);
    }
    @Override
    public float DiemTrungBinh(){
        return (2*toan+ly+hoa)/4;
    }
}

