
package lab2;


import java.util.Scanner;


public class bai10 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap cap cua ma tran : ");
            n= input.nextInt();
            if(n<0){
                System.out.println(" Loi vui long nhap lai:");
            }
        }while(n<0);
        float [][] a = new float [n][n];
        System.out.println("Nhap gia tri ma tran vuong");
        for(int i=0;i<n;i++){
            for(int m=0;m<n;m++){
                System.out.print( "Phan tu ma tran a [" + i + "][" + m + "] ");
                a[m][i]=a[i][m]= input.nextFloat();
            }
        }
        for(int i=0; i<n ; i++){
            for (int j=0; n>j; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}