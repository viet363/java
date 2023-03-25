package lab5.cau3;

import java.util.Date;

public class GiaoDichVang extends GiaoDich {

    private String loaivang;

    public GiaoDichVang(String magiaodich, Date ngaygiaodich, double dongia, double soluong, double thanhtien) {
        super(magiaodich, ngaygiaodich, dongia, soluong, thanhtien);
        this.loaivang = loaivang;
    }

    public String getLoaivang() {
        return loaivang;
    }

    @Override
    public String toString() {
        return toString() + "GiaoDichVang{" + "loaivang=" + loaivang + '}';
    }

}
