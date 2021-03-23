package tugas1;

import java.util.Arrays;
import java.util.Scanner;

public class e {
    public static void main(String[] args){
        
        System.out.println("     CAFE LARANG");
        System.out.println("    ANEKA MINUMAN");
        System.out.println("--------------------------");
        System.out.println("     SPECIAL MENU :");
        System.out.println("     1. Soft drink");
        System.out.println("     2. Mix juice");
        System.out.println("     3. Nescafe");
        System.out.println("     4. Soda milk");
        System.out.println("     5. Tea");
        
        System.out.println("--------------------------");    
        String namapembeli;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama Pembeli : ");
        namapembeli = scan.nextLine();
        System.out.println("");
        System.out.print("Silahkan masukkan pilihan anda : ");
        int pilihan = scan.nextInt();
        String pesanan = "";

        switch (pilihan){
            case 1:
                pesanan = "Soft drink";
                break;
            case 2:
                pesanan = "Mix juice";
                break;
            case 3:
                pesanan = "Nescafe";
                break;
            case 4:
                pesanan = "Soda milk";
                break;
            case 5:
                pesanan = "Tea";
                break;
            default:
                System.out.println("pilihan anda tidak ada di menu");
                break;
        }
        System.out.println("Minuman yang anda pesan adalah " +pesanan );
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih " +namapembeli+ " telah berkunjung di Cafe Larang");
        
    }
    
}