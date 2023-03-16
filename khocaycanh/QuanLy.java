package khocaycanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLy {
    ArrayList<khachhang> khachhang;
    ArrayList<caycanh> caycanh;
    ArrayList<Cayhaohut> cayhaohut;
    ArrayList<nhapkho> nhapkho;
    ArrayList<Xuatcaycanh> xuatcaycanh;
    ArrayList<nhacungcap> nhacungcap;

    public QuanLy() {
        caycanh = new ArrayList<>();
    }

    public void themDScay(caycanh a) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng cần thêm: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Lần nhập thứ " + (i + 1) + ": ");
            if (a instanceof Cayhaohut) {
                a = new Cayhaohut();
                a.nhapcaycanh();
            } else if (a instanceof nhapkho) {
                a = new nhapkho();
                a.nhapcaycanh();
            } else if (a instanceof Xuatcaycanh) {
                a = new Xuatcaycanh();
                a.nhapcaycanh();
            }
            caycanh.add(a);
        }
    }

        public void menuSuaDoi() {
        System.out.println("-------------Moi ban lua chon -----------");
        System.out.println("1. thay doi thong tin nhap cay canh");
        System.out.println("2. Xoa thong tin nhap cay canh");
        System.out.println("3. thay doi thong tin xuat cay canh ");
        System.out.println("4. xoa thong tin xuat cay canh");
        System.out.println("5. thay doi thong tin khach hang");
        System.out.println("6. xoa thong tin khach hang");
        System.out.println("7. thay doi thong tin nha cung cap");
        System.out.println("8. xoa thong tin nha cung cap");
        System.out.println("9. sua cay hao hut");
        System.out.println("----------- Chon so 0 de thoat ----------");
    }

    public void SuaDoi() {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            menuSuaDoi();
            System.out.print("Chon: ");
            n = input.nextInt();
            switch (n) {
                case 1 -> {
                    String MaCC;
                    System.out.print("Nhap Ma cay cua thong tin cay can sua: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    suanhapCay(MaCC);
                }
                case 2 -> {
                    String MaCC;
                    System.out.print("Nhap ma cay can sua: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    xoanhapCay(MaCC);
                }
                case 3 -> {
                    String MaCC;
                    System.out.print("Nhap Ma cay cua thong tin cay can sua:");
                    input.nextLine();
                    MaCC = input.nextLine();
                    suaxuatCay(MaCC);
                }
                case 4 -> {
                    String MaCC;
                    System.out.print("Nhap ma cay can sua: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    xoaxuatCay(MaCC);
                }
                case 5 -> {
                    System.out.println("Nhap ma khach hang: ");
                    input.nextLine();
                    String MaKH = input.nextLine();
                    suaKhachHang(MaKH);
                }
                case 6 -> {
                    System.out.println("Nhap ma khach hang: ");
                    input.nextLine();
                    String MaKH = input.nextLine();
                    xoaKhachHang(MaKH);
                }
                case 7 -> {
                    System.out.println("Nhap ma nha cung cap");
                    input.nextLine();
                    String MaNCC = input.nextLine();
                    suanhaCungCap(MaNCC);
                }
                case 8 -> {
                    System.out.println("Nhap ma nha cung cap");
                    input.nextLine();
                    String MaNCC = input.nextLine();
                    xoanhaCungCap(MaNCC);
                }
                case 9 -> {
                    System.out.println("Nhap ma cay canh");
                    input.nextLine();
                    String MaCC = input.nextLine();
                    suacayHaoHut(MaCC);
                }
                default -> {
                }
            }
        } while (n != 0);
    }

    public void suanhapCay(String MaCC) {
        for (caycanh x : caycanh) {
            if (x instanceof nhapkho ) {
                if (((nhapkho) x).getMaCC().compareTo(MaCC) == 1) {
                    x.nhapcaycanh();
                }
            }
        }
    }

    public void xoanhapCay(String MaCC) {
        for (caycanh x : caycanh) {
            if (x instanceof nhapkho) {
                if (((nhapkho) x).getMaCC().compareTo(MaCC) == 0) {
                    caycanh.remove(x);
                }
            }
        }
    }

    public void suaxuatCay(String MaCC) {
        for (caycanh x : caycanh) {
            if (x instanceof Xuatcaycanh) {
                if (((Xuatcaycanh) x).getMaCC().compareTo(MaCC) == 0) {
                    x.nhapcaycanh();
                }
            }
        }
    }
    public void xoaxuatCay(String MaCC){
        for (caycanh x : caycanh) {
            if (x instanceof Xuatcaycanh) {
                if (((Xuatcaycanh) x).getMaCC().compareTo(MaCC) == 0) {
                    caycanh.remove(x);
                }
            }
        }
    }
    public void suaKhachHang(String MaKH) {
        for ( khachhang x :khachhang ) {
            if (x instanceof  khachhang) {
                if ((( khachhang) x).getMaKH().compareTo(MaKH) == 0) {
                    x.nhapkhachhang();
                }
            }
        }
    }

     public void xoaKhachHang( String MaKH){
        for (khachhang x : khachhang) {
            if (x instanceof khachhang) {
                if (((khachhang) x).getMaKH().compareTo(MaKH) == 0) {
                    khachhang.remove(x);
                }
            }
        }
    }
 public void  suanhaCungCap(String MaNCC) {
        for (nhacungcap x : nhacungcap) {
            if (x instanceof nhacungcap) {
                if (((nhacungcap) x).getMaNCC().compareTo(MaNCC) == 0) {
                    x.nhapnhacungcap();
                }
            }
        }
    }
  public void xoanhaCungCap( String MaNCC){
        for (nhacungcap x : nhacungcap) {
            if (x instanceof nhacungcap) {
                if (((nhacungcap) x).getMaNCC().compareTo(MaNCC) == 0) {
                    nhacungcap.remove(x);
                }
            }
        }
    }
  public void suacayHaoHut(String MaCC) {
        for (caycanh x : caycanh) {
            if (x instanceof Cayhaohut ) {
                if (((Cayhaohut) x).getMaCC().compareTo(MaCC) == 0) {
                    x.nhapcaycanh();
                }
            }
        }
    }
  
    public void hienDSnhapkho() {
        System.out.println("----------------------------------------------");
        for (caycanh x : caycanh) {
            if (x instanceof nhapkho) {
                ((nhapkho) x).xuatnhapkho();
            }
        }
    }

    public void hienDSxuatkho() {
        System.out.println("----------------------------------------------");
        for (caycanh x : caycanh) {
            if (x instanceof Xuatcaycanh) {
                ((Xuatcaycanh) x).tradsxuatcaycanh();
            }
        }
    }

    public void hienDSkhachhang() {
        System.out.println("----------------------------------------------");
        for (khachhang x : khachhang) {
            if (x instanceof khachhang) {
                ((khachhang) x).xuatkhachhang();
            }
        }
    }

    public void hienDSnhacungcap() {
        System.out.println("----------------------------------------------");
        for (nhacungcap x : nhacungcap) {
            if (x instanceof nhacungcap) {
                ((nhacungcap) x).xuatnhacungcap();
            }
        }
    }
     public void hienDScayhaohut() {
        System.out.println("----------------------------------------------");
        for (Cayhaohut x : cayhaohut) {
            if (x instanceof Cayhaohut) {
                ((Cayhaohut) x).xuatcayhaohut();
            }
        }
    }

    public void ghiFile(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.flush();
            objOut.writeObject(caycanh);
            objOut.close();
            fileOut.close();
            System.out.println("Luu file thanh cong, ten file: " + fileName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}