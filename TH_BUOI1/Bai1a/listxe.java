package Bai1a;
import Bai1a.Vehicle;
import java.util.*;

public class listxe {

    Scanner input = new Scanner(System.in);
    ArrayList<Vehicle> dsx = new ArrayList();
    public listxe() {
      dsx = new ArrayList();
    }

    public void DSxe(Vehicle v) {
        System.out.print("Nhap so luong can them: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Lan nhap thu " + (i + 1) + ": ");
            if(v instanceof Vehicle){
                v= new Vehicle();
                   v.Nhap();
            }
            dsx.add(v);
        }      
    }
    public void hienDSXe() {
        for (Vehicle v : dsx) {
            if (v instanceof Vehicle) {
                v.xuat();
            }
        }
    }
        public void Menu(){
            System.out.println("CHON 1 DE NHAP THONG TIN XE");
            System.out.println("CHON 2 DE  XUAT BANG KE KHAI");
            System.out.println("CHON 3 DE THOAT CHUONG TRINH");
        }
}
