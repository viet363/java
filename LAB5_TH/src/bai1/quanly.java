package bai1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class quanly {

    private static ArrayList<phonghoc> danhSachphonghoc;
    Scanner input=new Scanner(System.in);
    public quanly() {
        danhSachphonghoc = new ArrayList<>();
    }
    
    public ArrayList getListPhongHoc(){
        return danhSachphonghoc;
    }

    public void themPhongHoc(phonghoc a) {
        System.out.print("Nhap so luong can them: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Lan nhap thu " + (i + 1) + ": ");
                a.nhap();
            }
          danhSachphonghoc.add(a);
        }
    

    public phonghoc timPhongHoc(String maphong) {
        for (phonghoc phongHoc : danhSachphonghoc) {
            if (phongHoc.getMaphong().equals(maphong)) {
                return phongHoc;
            }
        }
        return null;
    }

    public void inDanhSachPhongHoc() {
            System.out.println("Danh sach phong hoc:");
            for (phonghoc phongHoc : danhSachphonghoc) {
                System.out.println(phongHoc);
            }
    }

    public void inPhongHocDatChuan() {
        boolean coPhongHocDatChuan = false;
        System.out.println("Danh sach phong dat chuan:");
        for (phonghoc phongHoc : danhSachphonghoc) {
            if (phongHoc.datchuan()) {
                System.out.println(phongHoc);
                coPhongHocDatChuan = true;
            }
        }
        if (!coPhongHocDatChuan) {
            System.out.println("khong co phong hoc dat chuan.");
        }
    }

    public void sapXepTheoDayNha() {
        Collections.sort(danhSachphonghoc, new Comparator<phonghoc>() {
            @Override
            public int compare(phonghoc phongHoc1, phonghoc phongHoc2) {
                return phongHoc1.getDaynha().compareTo(phongHoc2.getDaynha());
            }
        });
        System.out.println("danh sach phong hoc da duoc sap xep theo day nha.");
    }

    public void sapXepTheoDienTichGiamDan() {
        Collections.sort(danhSachphonghoc, new Comparator<phonghoc>() {
            @Override
            public int compare(phonghoc phongHoc1, phonghoc phongHoc2) {
                return Double.compare(phongHoc2.getDientich(), phongHoc1.getDientich());
            }
        });
        System.out.println("danh sach phong hoc da duoc sap xep theo dien tich");
    }

    public void sapXepTheoSoBongDenTangDan() {
        Collections.sort(danhSachphonghoc, new Comparator<phonghoc>() {
            @Override
            public int compare(phonghoc phongHoc1, phonghoc phongHoc2) {
                return Integer.compare(phongHoc1.getSlden(), phongHoc2.getSlden());
            }
        });
        System.out.println("danh sach phong hoc da duoc sap xep theo so luong bong den:");
    }

    public void capNhatSoMayTinh(String maphong, int somay) {
        phonghoc phongHoc = timPhongHoc(maphong);
        if (phongHoc != null && phongHoc instanceof phongmaytinh) {
            ((phongmaytinh) phongHoc).setSomay(somay);
            System.out.println("cap nhat may tinh thanh cong.");
        } else {
            System.out.println("Khong tim thay ma phong:.");
        }
    }

    public void xoaPhongHoc(String maPhong) {
        phonghoc phongHoc = timPhongHoc(maPhong);
        if (phongHoc != null) {
            danhSachphonghoc.remove(phongHoc);
            System.out.println("Xoa phong hoc thanh cong.");
        } else {
            System.out.println("Khong tim thay ma phong:.");
        }
    }

    public int tinhTongSoPhongHoc() {
        return danhSachphonghoc.size();
    }

    public void inPhongMay60May() {
        boolean coPhongMay60May = false;
        System.out.println("danh sach phong co 60 may:");
        for (phonghoc phongHoc : danhSachphonghoc) {
            if (phongHoc instanceof phongmaytinh && ((phongmaytinh) phongHoc).getSomay()== 60) {
                System.out.println(phongHoc);
                coPhongMay60May = true;
            }
        }
        if (!coPhongMay60May) {
            System.out.println("Khong co phong nao 60 may.");
        }
    }
}
