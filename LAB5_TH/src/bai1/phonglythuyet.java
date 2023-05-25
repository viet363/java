package bai1;

import java.util.Scanner;

public class phonglythuyet extends phonghoc {

     boolean maychieu;

    public phonglythuyet() {
    }

    public phonglythuyet(boolean maychieu, String maphong, String daynha, float dientich, int slden) {
        super(maphong, daynha, dientich, slden);
        this.maychieu = maychieu;
    }

    public phonglythuyet(boolean maychieu) {
        this.maychieu = maychieu;
    }

    public boolean getMaychieu() {
        return maychieu;
    }

    public void setMaychieu(boolean maychieu) {
        this.maychieu = maychieu;
    }

    @Override
    public boolean datchuan() {
        return super.datchuan() && maychieu;
    }

    @Override
    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Co may chieu hay khong:");
        maychieu=input.hasNext();
    }

    @Override
    public String toString() {
        return "phongthinghiem{" + "maychieu=" + maychieu + '}';
    }

}
