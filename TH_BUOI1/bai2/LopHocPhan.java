package bai2;
import java.util.ArrayList;

public class LopHocPhan {
    ArrayList <SinhVien> svs;
    private String maLHP, tenLHP, tenGV, thongTinLopHoc;

    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public ArrayList<SinhVien> getSvs() {
        return svs;
    }

    public void setSvs(ArrayList<SinhVien> svs) {
        this.svs = svs;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }

    @Override
    public String toString() {
        return "ma LHP: " + maLHP + '\n' +
                "ten LHP: " + tenLHP + '\n' +
                "ten GV: " + tenGV + '\n' +
                "thong tin lop hoc: " + thongTinLopHoc + '\n';
    }

    public int getSoluong(){
        return svs.size();
    }
    public void dssv(){
        System.out.println("Danh sach sinh vien");
        for (SinhVien sv : svs) {
            System.out.printf("%-5s %-30s\n",
                    sv.getMaSV() + " | ",
                    sv.getTenSV());
        }
    }
}