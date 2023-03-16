package lab4.bai2;
public class main {
    public static void main(String[] args) {
        HocSinh HS=new HocSinh(LQV, lop12A, 9, 9, 7);
        System.out.println("diem trung binh ="+HS.DiemTrungBinh());
        HS =new HocSinhChuyenToan();
        System.out.println("diem trung binh ="+HS.DiemTrungBinh());
    }
    
}