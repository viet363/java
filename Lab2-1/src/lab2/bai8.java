package lab2;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        int a;
        System.out.println("Nhap vao so can tinh: ");
        Scanner S = new Scanner(System.in);
         a = S.nextInt();
         double n = 1;
        int i = 1;
        while(i<=a)
        {
            n = n * i;
            i++;
        }
        System.out.println("Giai thua cua "+a+" la: "+n);
    }
}