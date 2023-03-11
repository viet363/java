package cau1;
     import java.util.Scanner;
public class main  {
    public static void main(String[] args) throws Exception {
     Scanner input= new Scanner(System.in);
     quatao T1=new quatao();
          System.out.println("nhap gia nhap:");
          gianhap= input.nextInt();
          System.out.println("nhap gia ban :");
          giaban=input.nextLine();
          System.out.println("nhap  so luong :");
         soluong=input.nextLine();
         System.out.print("{\", gia nhap: \"+ getgianhap()+ gia ban: "+getgiaban() + ", soluong: "+
                    getsoluong() + "}");
    }    
}
