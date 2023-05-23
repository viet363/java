package bai3;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        ArrayList<diemhocvien> list;
        list = new ArrayList<>();
        list.add(new diemhocvien("Nguyen Van A", 2003, 9, 5.0, 8.0, 9.0, 8.8));
        list.add(new diemhocvien("Le Thi B", 2004, 7.0, 8.5, 6.0, 4.0, 10));
        list.add(new diemhocvien("Vo Van C", 2003, 80, 9, 3.5, 7.0, 9.8));

        int soLuongLuanVan = 0;
        int soLuongTotNghiep = 0;
        int soLuongThiLai = 0;
        ArrayList<String> monThiLai = new ArrayList<>();

        for (diemhocvien hocVien : list) {
            double diemTrungBinh = hocVien.tinhDTB();
            boolean coMonDuoi5 = false;

            if (diemTrungBinh >= 7) {
                if (hocVien.getDiemMon1() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon2() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon3() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon4() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon5() < 5) {
                    coMonDuoi5 = true;
                }
                if (coMonDuoi5 == false) {
                    soLuongLuanVan++;
                }
            }
            if (diemTrungBinh < 7) {
                if (hocVien.getDiemMon1() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon2() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon3() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon4() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon5() < 5) {
                    coMonDuoi5 = true;
                }
                if (coMonDuoi5 == false) {
                    soLuongTotNghiep++;
                }
            }
            if (hocVien.getDiemMon1() < 5) {
                coMonDuoi5 = true;
                monThiLai.add("Mon 1");
            }
            if (hocVien.getDiemMon2() < 5) {
                coMonDuoi5 = true;
                monThiLai.add("Mon 2");
            }
            if (hocVien.getDiemMon3() < 5) {
                coMonDuoi5 = true;
                monThiLai.add("Mon 3");
            }
            if (hocVien.getDiemMon4() < 5) {
                coMonDuoi5 = true;
                monThiLai.add("Mon 4");
            }
            if (hocVien.getDiemMon5() < 5) {
                coMonDuoi5 = true;
                monThiLai.add("Mon 5");
            }
            if (coMonDuoi5) {
                soLuongThiLai++;
            }
        }

        System.out.println("So luong hoc vien duoc lam luan van tot nghiep:" + soLuongLuanVan);
        System.out.println("so luong hoc vien thi tot nghiep: " + soLuongTotNghiep);
        System.out.println("So luong hoc vien thi lai: " + soLuongThiLai);
        System.out.println("Cac mon can thi lai: " + monThiLai);
    }
}
