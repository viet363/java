package bai2;

import java.time.LocalDate;
import java.util.Scanner;

public class khachhang {

    private String makh, hoten;
    private LocalDate ngayxuatHD;

    public khachhang() {

    }

    public khachhang(String makh, String hoten, LocalDate ngayxuatHD) {
        this.makh = makh;
        this.hoten = hoten;
        this.ngayxuatHD = ngayxuatHD;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public LocalDate getNgayxuatHD() {
        return ngayxuatHD;
    }

    public void setNgayxuatHD(LocalDate ngayxuatHD) {
        this.ngayxuatHD = ngayxuatHD;
    }

    public double thanhTien() {
        return 0;
    }

    @Override
    public String toString() {
        return "khachhang{" + "makh=" + makh + ", hoten=" + hoten + ", ngayxuatHD=" + ngayxuatHD + '}';
    }

    public void Nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma khach hang:");
        makh = input.nextLine();
        System.out.println("Nhap ten khach hang:");
        hoten = input.nextLine();
        ngayxuatHD = LocalDate.now();
    }
}
