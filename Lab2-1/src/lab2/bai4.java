package lab2;
         import java.util.Scanner;
         import java.lang.Math;
public class bai4 {
    // Ham giai phuong trinh bac nhat
    private static void bai1(){ 
        Scanner So = new Scanner(System.in);
        System.out.println("phuong trinh bac nhat co dang la: ax+b=0");
        System.out.println("Nhap so a:");
        float a= So.nextFloat();
        System.out.println("nhap so b:");
        float b= So.nextFloat();
        float c;
        if (a==0){
            if(b==0){
                System.out.println("phuong trinh co vo so nghiem");
            }else{
                System.out.printf("phuong trinh vo nghiem");}
        }else{
            c=-b/a;
            System.out.printf("phuong trinh co nghiem la :x= %f",c);
            }
    }
    // Ham giai phuong trinh bac 2
    private static void bai2(){ 
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
    // Ham tinh tien dien da 
    private static void bai3(){
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
    public static void main(String[] args) { 
        Scanner s= new Scanner(System.in);
                  System.out.println("Vui long Chon 1:Giai phuong trinh bac nhat");
                  System.out.println("Vui long chon 2:Giai phuong trinh bac 2");
                  System.out.println("Vui long chon 3:tinh tien dien da su dung trong thang");
                  System.out.println("Vui long chon 4:Ket thuc chuong trinh");
                  int a= s.nextInt();
        switch (a){
        case 1: bai1(); break;
        case 2: bai2(); break;
        case 3: bai3(); break;
        case 4: System.out.println("Cam on va hen gap lai "); break;
        default: System.out.print("Nhap sai !!! xin hay nhap lai:");        
        }
    }
}
