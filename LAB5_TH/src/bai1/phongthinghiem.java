package bai1;

import java.util.Scanner;

public class phongthinghiem extends phonghoc {

    boolean bonrua;
    String chuyennganh;
    int succhua;

    public phongthinghiem() {

    }

    public phongthinghiem(boolean bonrua, String chuyennganh, int succhua, String maphong, String daynha, double dientich, int slden) {
        super(maphong, daynha, dientich, slden);
        this.bonrua = bonrua;
        this.chuyennganh = chuyennganh;
        this.succhua = succhua;
    }

    public phongthinghiem(boolean bonrua, String chuyennganh, int succhua) {
        this.bonrua = bonrua;
        this.chuyennganh = chuyennganh;
        this.succhua = succhua;
    }



    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public boolean isBonrua() {
        return bonrua;
    }

    public void setBonrua(boolean bonrua) {
        this.bonrua = bonrua;
    }

    public int getSucchua() {
        return succhua;
    }

    public void setSucchua(int succhua) {
        this.succhua = succhua;
    }

    @Override
    public boolean datchuan() {
        return super.datchuan() && bonrua;
    }

    @Override
    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Chuyen nganh:");
        chuyennganh = input.nextLine();
        System.out.println("Nhap suc chua cua phong:");
        succhua = input.nextInt();
        System.out.println("Co bon rua khong:");
        bonrua = input.hasNext();
    }

    @Override
    public String toString() {
        return "phongthinghiem{" + "chuyennganh=" + chuyennganh + ", bonrua=" + bonrua + ", succhua=" + succhua + '}';
    }

}
