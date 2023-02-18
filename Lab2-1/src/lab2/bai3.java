package lab2;
  import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        System.out.println("So dien su dung trong thang :");
        float a= s.nextFloat();
        if (a>=0 && a<=50){
            float t= a*1000;
            System.out.printf("Tong so tien dien phai tra trong thang la: %f",t);}
        else{
            float t= (a-50)*1200+50*1000;
            System.out.printf("Tong so tien dien phai tra trong thang la: %f",t);}
    }
}
