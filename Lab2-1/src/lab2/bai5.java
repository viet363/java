package lab2;
 import java.util.Scanner;
 import java.lang.Math;
public class bai5 {
    static boolean kiemtrasochinhphuong(double a)
    {
        double b = Math.sqrt(a);
        return ((b - Math.floor(a)) == 0);
    }
    public static void main(String[] args) { 
        Scanner s= new Scanner(System.in);
        System.out.printf("nhap so can kiem tra: ");
        double b = s.nextDouble();
        if(kiemtrasochinhphuong(b=0)){
            System.out.println( " la so chinh phuong ");}
        else{
            System.out.println( " khong phai la so chinh phuong");
        }
    }
}