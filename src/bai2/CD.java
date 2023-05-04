package bai2;
import java.util.Scanner;
public class CD {
    private int maCD;
    private String tuaCD;
    private int sobaihat;
    private double giathanh;
    public CD(){
        maCD = 999999;
        tuaCD = "Chua xac dinh";
    }
    public CD ( int maCD, String tuaCD, int sobaihat, double giathanh){
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.sobaihat = sobaihat;
        this.giathanh = giathanh;
    }
    
    public int getMaCD() {
        return this.maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return this.tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public int getSobaihat() {
        return this.sobaihat;
    }

    public void setSobaihat(int sobaihat) {
        this.sobaihat = sobaihat;
    }

    public double getGiathanh() {
        return this.giathanh;
    }

    public void setGiathanh(double giathanh) {
        this.giathanh = giathanh;
    }   
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma CD: ");
        maCD = input.nextInt();
        input.nextLine();
        System.out.println("Nhap tua CD: ");
        tuaCD = input.nextLine();
        System.out.println("Nhap so bai hat: ");
        sobaihat = input.nextInt();
        System.out.println("Nhap gia thanh: ");
        giathanh = input.nextDouble();
    }
    @Override
    public String toString() {
        return "{" +
            " maCD='" + getMaCD() + "'" +
            ", tuaCD='" + getTuaCD() + "'" +
            ", sobaihat='" + getSobaihat() + "'" +
            ", giathanh='" + getGiathanh() + "'" +
            "}";
    }
    public int size() {
        return 0;
    }
}