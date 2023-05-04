package bai2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("123", "Nguyen Van A");
        SinhVien sv2 = new SinhVien("543", "Le Thi B");
        SinhVien sv3 = new SinhVien("321", "Luong Van C");
        LopHocPhan lhp = new LopHocPhan("123456","LT Huong Doi Tuong","Nguyen Van A","Thu 7, Tiet 4-6, Phong A1.1");
        lhp.svs = new ArrayList<>();
        lhp.svs.add(sv1);
        lhp.svs.add(sv2);
        lhp.svs.add(sv3);
        System.out.printf(lhp.toString());
        System.out.println();
        lhp.dssv();
        System.out.printf("Tong so sinh vien: "+ lhp.getSoluong());
    }
}