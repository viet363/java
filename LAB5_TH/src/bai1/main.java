package bai1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        phonghoc a = new phonghoc();
        phonglythuyet b = new phonglythuyet();
        phongthinghiem c = new phongthinghiem();
        phongmaytinh d = new phongmaytinh();
        quanly quanlyphonghoc = new quanly();
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Them phong hoc");
            System.out.println("2. Tiem kiem phong hoc");
            System.out.println("3. In danh sach phong hoc");
            System.out.println("4. In danh sach phong hoc dat chuan");
            System.out.println("5. Sap xep danh sach theo danh nha");
            System.out.println("6. Sap xep danh sach theo dien tich dam dan");
            System.out.println("7. Sap xep danh sach theo so luong bong den tang dan");
            System.out.println("8. Cap nhat so may tinh trong phong may");
            System.out.println("9. Xoa phong hoc");
            System.out.println("10.Tong so phong hoc");
            System.out.println("11.in danh sach phong may co 60 may");
            System.out.println("0. Thoat");
            System.out.print("nhap lua chon cua ban: ");
            n = input.nextInt();

            switch (n) {
                case 1:
                    quanlyphonghoc.themPhongHoc(a);
                    System.out.println("Chon loai phong:");
                    System.out.println("1.Phong ly thuyet");
                    System.out.println("2.Phong may tinh");
                    System.out.println("3.Phong thi nghiem");
                    System.out.print("Nhap lua chon cua ban: ");
                    int loai = input.nextInt();
                    input.nextLine();

                    switch (loai) {
                        case 1:
                            b.nhap();
                            break;
                        case 2:
                            c.nhap();
                            break;
                        case 3:
                            d.nhap();
                            break;
                        default:
                            System.out.println("Lua chon khong hop le.");
                    }

                    break;
                case 2:
                    System.out.println("Nhap ma phong can tim ");
                    String maPhongTimKiem = input.nextLine();
                    quanlyphonghoc.timPhongHoc(maPhongTimKiem);
                    break;
                case 3:
                    quanlyphonghoc.inDanhSachPhongHoc();
                    break;
                case 4:
                    quanlyphonghoc.inPhongHocDatChuan();
                    break;
                case 5:
                    quanlyphonghoc.sapXepTheoDayNha();
                    quanlyphonghoc.inDanhSachPhongHoc();
                    break;
                case 6:
                    quanlyphonghoc.sapXepTheoDienTichGiamDan();
                    quanlyphonghoc.inDanhSachPhongHoc();
                    break;
                case 7:
                    quanlyphonghoc.sapXepTheoSoBongDenTangDan();
                    quanlyphonghoc.inDanhSachPhongHoc();
                    break;
                case 8:
                    System.out.print("Nhap ma phong can cap nhat: ");
                    String maPhongCapNhat = input.nextLine();
                    System.out.print("Nhap so may tinh: ");
                    int soMayTinhCapNhat = input.nextInt();
                    quanlyphonghoc.capNhatSoMayTinh(maPhongCapNhat, soMayTinhCapNhat);
                    break;
                case 9:
                    System.out.print("Nhap ma phong can xoa: ");
                    String maPhongXoa = input.nextLine();
                    quanlyphonghoc.xoaPhongHoc(maPhongXoa);
                    break;
                case 10:
                    int tongSoPhongHoc = quanlyphonghoc.tinhTongSoPhongHoc();
                    System.out.println("Tong so phong hoc: " + tongSoPhongHoc);
                    break;
                case 11:
                    quanlyphonghoc.inPhongMay60May();
                    break;
                case 0:
                    break;
                default:
            }
        } while (n != 0);

    }
}
