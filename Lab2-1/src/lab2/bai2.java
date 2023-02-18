package lab2;
         import java.util.Scanner;
         import java.lang.Math;
public class bai2 {
    public static void main(String[] args) { 
        Scanner n = new Scanner(System.in);
        System.out.println("phuong trinh bac hai co dang la: ax^2+bx+c=0");
        System.out.println("Nhap so a:");
        float a= n.nextFloat();
        System.out.println("Nhap so b:");
        float b= n.nextFloat();
        System.out.println("Nhap so c:");
        float c= n.nextFloat();
        if (a==0){
           if(b==0){
               if(c==0){
                   System.out.println("Phuong trinh co vo so nghiem");}
           else{
               System.out.println("Phuong trinh vo nghiem");}
           }else{
                   System.out.printf("Phuong trinh co nghiem la :x= %f",-c/b);}
        } else{
                      float d=(b*b-(4*a*c));
                 if(d<0){
                         System.out.println("Phuong trinh vo nghiem");}
                 else if(d==0){
                         System.out.printf("Phuong trinh co nghiem kep:x1=x2= %f",-b/2*a);}
                 else if (d>0){
                         float x1= (float)(-b+(Math.sqrt(d)/2*a));
                         float x2= (float)(-b-(Math.sqrt(d)/2*a));
                         System.out.printf("Phuong trinh co hai nghiem phan biet:x1= %f , x2= %f",x1,x2);
                         }
            }
        }  
    }
