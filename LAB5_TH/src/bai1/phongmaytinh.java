package bai1;

import java.util.Scanner;

public class phongmaytinh extends phonghoc {

    int somay;

    public phongmaytinh() {
    }

    public phongmaytinh(int somay, String maphong, String daynha, float dientich, int slden) {
        super(maphong, daynha, dientich, slden);
        this.somay = somay;
    }

    public phongmaytinh(int somay) {
        this.somay = somay;
    }

    public int getSomay() {
        return somay;
    }

    public void setSomay(int somay) {
        this.somay = somay;
    }

    @Override
    public boolean datchuan() {
        return super.datchuan() && (getDientich()/ somay >= 1.5);
    }

    @Override
    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong may tinh:");
        somay = input.nextInt();
    }

    @Override
    public String toString() {
        return "phongmaytinh{" + "somay=" + somay + '}';
    }

}
