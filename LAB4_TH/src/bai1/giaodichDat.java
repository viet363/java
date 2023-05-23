package bai1;
import java.time.LocalDate;
import java.util.Scanner;
public class giaodichDat extends giaodich{
    private String loaidat;
    public giaodichDat(){
        
    }

    public giaodichDat(String loaidat) {
        this.loaidat = loaidat;
    }

    public giaodichDat(String loaidat, String maGD, LocalDate ngaygiaodich, double dongia, double dientich) {
        super(maGD, ngaygiaodich, dongia, dientich);
        this.loaidat = loaidat;
    }

    public String getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }

    @Override
    public String toString() {
        return "giaodichDat{" + "loaidat=" + loaidat + '}';
    }
    public double thanhtien(){
        double thanhtien;
        if(loaidat=="A"){
            return thanhtien=dientich*1.5*dongia;
        }else
        return thanhtien=dientich*dongia;
    }
    public void nhap(){
        super.nhap();
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap loai dat:");
        loaidat=input.nextLine();
    }
}
