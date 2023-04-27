package quanlykhocaycanh;

import quanlykhocaycanh.CayCanh;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy {

    ArrayList<CayCanh> caycanh = new ArrayList<>();
    ArrayList<listCayThanGo> caythango = new ArrayList<>();
    ArrayList<listCayThanThao> caythanthao = new ArrayList<>();
    ArrayList<ThongKe> thongke = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public QuanLy() {
        caycanh = new ArrayList<>();
        caythango = new ArrayList<>();
        caythanthao = new ArrayList<>();
    }

    public void DScay(CayCanh a) {
        System.out.print("Nhap so luong can them: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Lan nhap thu " + (i + 1) + ": ");
            if (a instanceof ThongKe) {
                a = new ThongKe();
                a.Nhap();
            } else if (a instanceof listCayThanGo) {
                a = new listCayThanGo();
                a.Nhap();
            } else if (a instanceof listCayThanThao) {
                a = new listCayThanThao();
                a.Nhap();
            }
            caycanh.add(a);
        }
    }

    public void menuSuaDoi() {
        System.out.println("-------------MOI BAN CHON -----------");
        System.out.println("1. THAY DOI THONG TIN CAY THAN GO");
        System.out.println("2. XOA THONG TIN CAY THAN GO");
        System.out.println("3. THAY DOI THONG TIN CAY THAN THAO");
        System.out.println("4. XOA THONG TIN CAY THAN THAO");
        System.out.println("5. THAY DOI THONG TIN THONG KE");
        System.out.println("6. XOA THONG TIN THONG KE");
        System.out.println("-----------NHAN 0 DE THOAT----------");
    }

    public void SuaDoi() {

        int n;
        do {
            menuSuaDoi();
            System.out.println("CHON: ");
            n = input.nextInt();
            switch (n) {
                case 1 -> {
                    String MaCC;
                    System.out.println("NHAP MA CAN SUA : ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    suaDSCayThanGo(MaCC);
                }
                case 2 -> {
                    String MaCC;
                    System.out.println("NHAP MA CAY CAN XOA: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    xoaDSCayThanGo(MaCC);
                }
                case 3 -> {
                    String MaCC;
                    System.out.println("NHAP MA CAN SUA:");
                    input.nextLine();
                    MaCC = input.nextLine();
                    suaDSCayThanThao(MaCC);
                }
                case 4 -> {
                    String MaCC;
                    System.out.println("NHAP MA CAY CAN XOA: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    xoaDSCayThanThao(MaCC);
                }
                case 5 -> {
                    System.out.println("NHAP MA CAN SUA");
                    input.nextLine();
                    String MaCC = input.nextLine();
                    suaThongKe(MaCC);
                }
                case 6 -> {
                    System.out.println("NHAP MA CAY CAN XOA");
                    input.nextLine();
                    String MaCC = input.nextLine();
                    xoaThongKe(MaCC);
                }
                default -> {
                }
            }
        } while (n != 0);
    }

    public void suaDSCayThanGo(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof listCayThanGo) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    x.Nhap();
                }
            }
        }
    }

    public void xoaDSCayThanGo(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof listCayThanGo) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    caycanh.remove(x);
                }
            }
        }
    }

    public void suaDSCayThanThao(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof listCayThanThao) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    x.Nhap();
                }
            }
        }
    }

    public void xoaDSCayThanThao(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof listCayThanThao) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    caycanh.remove(x);
                }
            }
        }
    }

    public void suaThongKe(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof ThongKe) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    x.Nhap();
                }
            }
        }
    }

    public void xoaThongKe(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof ThongKe) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    caycanh.remove(x);
                }
            }
        }
    }

    public void hienDS() {
        System.out.println("----------------------------------------------");
        for (CayCanh x : caycanh) {
            x.Xuat();
        }
    }

    public void hienDSCayThanGo() {
        System.out.println("----------------------------------------------");
        for (CayCanh x : caycanh) {
            if (x instanceof listCayThanGo) {
                x.Xuat();
            }
        }
    }

    public void hienDSCayThanThao() {
        System.out.println("----------------------------------------------");
        for (CayCanh x : caycanh) {
            if (x instanceof listCayThanThao) {
                x.Xuat();
            }
        }
    }

    public void hienDSCay() {
        System.out.println("----------------------------------------------");
        for (CayCanh x : caycanh) {
            x.Xuat();
        }
    }

    public void hienThongKe() {
        System.out.println("----------------------------------------------");
        for (CayCanh x : caycanh) {
            if (x instanceof ThongKe) {
                x.Xuat();
            }
        }
    }

    public void ghiFile(String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.flush();
            oos.writeObject(caycanh);
            oos.close();
            fos.close();
            System.out.println("Luu file thanh cong, ten file: " + fileName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void docFile(String fileName) {
        try {
            caycanh = new ArrayList<>();
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream fout = new ObjectInputStream(fin);
            caycanh = (ArrayList) fout.readObject();
            hienDS();
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.print("\nKhong thay file.\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void SapXepTheoGiaCay() {
        Collections.sort(this.caycanh, new Comparator<CayCanh>() {
            public int compare(CayCanh o1, CayCanh o2) {
                int i = (int) (o1.getGia() - o2.getGia());
                if (i < 0) {
                    return -1;
                } else if (i == 0) {
                    return 0;
                }
                return 1;
            }
        }
            
        );
    }

    public void timkiemCayThanThao(String Macc) {
        for (CayCanh x : caycanh) {
            if (x instanceof listCayThanThao && ((listCayThanThao) x).getMaCC().equalsIgnoreCase(Macc) == true) {
                x.Xuat();
            }
        }
    }

    public void timkiemCayThanGo(String Macc) {
        for (CayCanh x : caycanh) {
            if (x instanceof listCayThanGo && ((listCayThanGo) x).getMaCC().equalsIgnoreCase(Macc) == true) {
                x.Xuat();
            }
        }
    }

    public void menuChinh() {
        System.out.println("------QUAN LY CAY CANH------");
        System.out.println("1.NHAP DANH SACH CAY THAN GO ");
        System.out.println("2.HIEN DANH SACH CAY THAN GO ");
        System.out.println("3.NHAP DANH SACH CAY THAN THAO");
        System.out.println("4.HIEN DANH SACH CAY THAN THAO ");
        System.out.println("5.NHAP BANG THONG KE");
        System.out.println("6.HIEN BANG THONG KE");
        System.out.println("7. LUU FILE NHAP");
        System.out.println("8. DOC DU LIEU TU FILE");
        System.out.println("9.SUA DOI THONG TIN");
        System.out.println("10.SAP XEP THONG TIN CAY CANH");
        System.out.println("11.TIM KIEM CAY TRONG CAY THAN GO");
        System.out.println("12.TIM KIEM CAY TRONG CAY THAN THAO");
        System.out.println("-----Nhan 0 de thoat chuong trinh-----");
    }
}
