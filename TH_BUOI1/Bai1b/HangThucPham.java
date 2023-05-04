package Bai1b;
import java.time.LocalDate;
import java.util.Scanner;
public class HangThucPham {
    private String maHang;
    private String tenHang = "xxx";
    private double donGia;
    private LocalDate ngaySanXuat = LocalDate.now(), ngayHetHan = ngaySanXuat;
    public HangThucPham() {
    }

     public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) throws Exception{
        if (!maHang.trim().equals("")){
            this.maHang = maHang;
        }else
            throw new Exception("Loi: Ma hang rong!");
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        return "HangThucPham{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + donGia +
                ", ngaySanXuat=" + ngaySanXuat +
                ", ngayHetHan=" + ngayHetHan +
                '}';
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.printf("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.printf("Nhap don gia: ");
        do {
            donGia = sc.nextDouble();
            if (donGia < 0){
                System.out.printf("Loi! Nhap lai: ");
            }
        }while (donGia < 0);

        System.out.printf("Nhap ngay san xuat: ");
        int ngay = sc.nextInt();
        System.out.printf("Nhap thang san xuat: ");
        int thang = sc.nextInt();
        System.out.printf("Nhap nam san xuat: ");
        int nam = sc.nextInt();
        ngaySanXuat = LocalDate.of(nam,thang,ngay);

        System.out.printf("Nhap ngay het han: ");
        int ngayhh = sc.nextInt();
        System.out.printf("Nhap thang het han: ");
        int thanghh = sc.nextInt();
        System.out.printf("Nhap nam het han: ");
        int namhh = sc.nextInt();
        ngayHetHan = LocalDate.of(namhh,thanghh,ngayhh);
    }
    public boolean ktHSD(){
        return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
    }

}
