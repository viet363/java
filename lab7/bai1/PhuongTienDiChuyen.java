package lab7.bai1;
public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;
    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
    public String layTenHangSanXuat() {
        return hangSanXuat.tenHangSanXuat;
    }

    public void batDau() {
        System.out.println("Bat dau...");
    }

    public void tangToc() {
        System.out.println("Tang toc...");
    }

    public void dungLai() {
        System.out.println("Dung lai...");
    }

    abstract double layVanToc();
}