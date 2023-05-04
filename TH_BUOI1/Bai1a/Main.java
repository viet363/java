package Bai1a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        listxe a = new listxe();
        Vehicle v ;
        int n;
        Scanner input = new Scanner(System.in);
        do {
            a.Menu();
            System.out.print("Lua Chon:");
            n = input.nextInt();
            switch (n) {
                case 1 -> {
                    v=new Vehicle();
                    a.DSxe(v);
                }
                case 2 -> {
                    System.out.format("%-26s %-26s %-26s %-26s %-26s\n", "Ten chu xe", "loai xe", "dung tich", "tri gia", "thue phai nop");
                    System.out.println("==========================================================================================================================");
                    a.hienDSXe();
                }
                default -> {
                }
            }
        } while (n != 3);
    }
}
