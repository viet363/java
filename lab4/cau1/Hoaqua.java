package cau1;
public class Hoaqua {
          private String tenqua,nguongoc;
          private int  soluong,giaban,ngaynhap;
          private float gianhap;

    public Hoaqua() {
    }

    public Hoaqua(String tenqua, String nguongoc, int soluong, int giaban, int ngaynhap, float gianhap) {
        this.tenqua = tenqua;
        this.nguongoc = nguongoc;
        this.soluong = soluong;
        this.giaban = giaban;
        this.ngaynhap = ngaynhap;
        this.gianhap = gianhap;
    }      

    public String getTenqua() {
        return tenqua;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getGiaban() {
        return giaban;
    }

    public int getNgaynhap() {
        return ngaynhap;
    }

    public float getGianhap() {
        return gianhap;
    }

    public void setTenqua(String tenqua) {
        this.tenqua = tenqua;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public void setNgaynhap(int ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public void setGianhap(float gianhap) {
        this.gianhap = gianhap;
    }
    
}


