package bai1;

import java.util.*;
import java.time.*;

public class quanlyGiaoDich {

    private ArrayList<giaodich> x = new ArrayList<>();

    public quanlyGiaoDich() {
        x = new ArrayList<>();
    }

    public void themGD(giaodich gd) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong can them:");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Lan nhap thu "+i);
            if(gd instanceof giaodichDat){
                gd = new giaodichDat();
                gd.nhap();
            }else if ( gd instanceof giaodichNha){
                gd = new giaodichNha();
                gd.nhap();
            }
            x.add(gd);
        } 
    }
    public void xuatDS(){
        for (giaodich gd : x) {
            System.out.println(gd.toString());
            System.out.println("Thanh tien: "+ gd.thanhTien());
        }
    }
      public int demSL(String loai){
        int temp = 0;
        for (giaodich gd : x) {
            if(gd instanceof giaodichDat && loai.equals("dat")){
                temp ++;
            } else if (gd instanceof giaodichNha && loai.equals("nha")) {
                temp ++;
            }
        }
        return temp;
    }
      public double tinhTBThanhTien(){
        double tongThanhTien = 0;
        int dem = 0;
        for(giaodich gd : x){
            if (gd instanceof giaodichDat){
                tongThanhTien += gd.thanhTien();
                dem++;
            }
        }
        if(dem != 0){
            return tongThanhTien/dem;
        }else {
            return 0;
        }
    }

    public void xuatGDNow(){
        for (giaodich gd : x){
            if(gd.getNgaygiaodich().equals(LocalDate.now())){
                System.out.println(gd.toString());
                System.out.println("Thanh tien: "+ gd.thanhTien());
            }
        }
    }
}

