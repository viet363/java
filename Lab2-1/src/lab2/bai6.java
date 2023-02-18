package lab2;
    import java.util.Scanner;
    
public class bai6 {
      public static void main(String[] args) { 
         Scanner S = new Scanner(System.in);
         
         System.out.println("nhap diem trung binh cua hoc sinh:");
         float a= S.nextFloat();
         if (a<5.00){
              System.out.println("hoc sinh kem");}
         else if(5.00<=a && a<7){
             System.out.println("hoc sinh trung binh");}
         else if( a>=7 && a<=8){
             System.out.println("hoc sinh kha");
         }
         else{
             System.out.println("hoc sinh gioi");
         }
      }
}
