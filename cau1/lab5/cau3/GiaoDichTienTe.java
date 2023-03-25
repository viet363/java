package lab5.cau3;

import java.util.Date;

public class GiaoDichTienTe extends GiaoDich {

    private double tigia;
    private double tienEuro;
    private double tienUSD;

    public GiaoDichTienTe(String magiaodich, Date ngaygiaodich, double dongia, double soluong, double thanhtien, double tigia, double tienEuro, double tienUSD) {
        super(magiaodich, ngaygiaodich, dongia, soluong, thanhtien);
        this.tigia = tigia;
        this.tienEuro = tienEuro;
        this.tienUSD = tienUSD;
    }

    public double getTigia() {
        return tigia;
    }

    public void setTigia(double tigia) {
        this.tigia = tigia;
    }

    public double getTienEuro() {
        return tienEuro;
    }

    public void setTienEuro(double tienEuro) {
        this.tienEuro = tienEuro;
    }

    public double getTienUSD() {
        return tienUSD;
    }

    public void setTienUSD(double tienUSD) {
        this.tienUSD = tienUSD;
    }

    @Override
    public String toString() {
        return toString()+"GiaoDichTienTe{" + "tigia=" + tigia + ", tienEuro=" + tienEuro + ", tienUSD=" + tienUSD + '}';
    }
    
}
