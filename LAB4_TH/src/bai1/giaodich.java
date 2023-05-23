package bai1;
 import java.util.Scanner;
import java.time.LocalDate;
public class giaodich {
    private String maGD;
    private LocalDate ngaygiaodich;
    double dongia;
    double dientich;
    public giaodich(){
        
    }

    public giaodich(String maGD, LocalDate ngaygiaodich, double dongia, double dientich) {
        this.maGD = maGD;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.dientich = dientich;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public LocalDate getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(LocalDate ngay) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
        
    }
     public double thanhTien(){
        return 0;
    }


    @Override
    public String toString() {
        return "giaodich{" + "maGD=" + maGD + ", ngay=" + ngaygiaodich + ", dongia=" + dongia + ", dientich=" + dientich + '}';
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma giao dich:");
        maGD=input.nextLine();
        ngaygiaodich=LocalDate.now();
        System.out.println("Nhap don gia:");
        dongia=input.nextDouble();
        System.out.println("Nhap dien tich:");
        dientich=input.nextDouble();
    }
}
