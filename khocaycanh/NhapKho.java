package khocaycanh;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class NhapKho extends CayCanh {

    private long GiaThanh;
    private ArrayList<NhaCungCap> NCC;
    private ArrayList<NhapKho> NK;
    NhaCungCap NhaCungCap1;

    public NhapKho(String MaCC, String TenCay, String PhanLoai, int SoLuong) {
        super(MaCC, TenCay, PhanLoai, SoLuong);
        this.GiaThanh = GiaThanh;
    }

    public NhapKho() {
        
    }

    public long getGiaThanh() {
        return GiaThanh;
    }

    public void setGiaThanh(long GiaThanh) {
        this.GiaThanh = GiaThanh;
    }

    public ArrayList<NhaCungCap> getNCC() {
        return NCC;
    }

    public void setNCC(ArrayList<NhaCungCap> NCC) {
        this.NCC = NCC;
    }

    public NhaCungCap getNhaCungCap1() {
        return NhaCungCap1;
    }

    public void setNhaCungCap1(NhaCungCap NhaCungCap1) {
        this.NhaCungCap1 = NhaCungCap1;
    }

    public void NhapKhoCay() {
        NhapCayCanh();
        System.out.print("gia nhap vao cua cay : ");
        GiaThanh = input.nextLong();
        Nhapdsnhacungcap();
    }

    public void Nhapdsnhacungcap() {
        System.out.print("Nhap so luong hang can nhap : ");
        int n = input.nextInt();
        NCC = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            NhaCungCap1 = new NhaCungCap();
            String maNCC = NhaCungCap1.getMaNCC();
            boolean add = NCC.add(NhaCungCap1);
        }
    }

    public void XuatNhaCungCap() {
        for (NhaCungCap x : NCC) {
            x.XuatNhaCungCap();
        }
    }

    public void XuatNhapKho() {
        super.XuatCayCanh();
        System.out.println("Gia nhap: " + getGiaThanh());
        XuatNhaCungCap();
        XuatCayCanh();
    }
}