package tugas1;

import java.util.Scanner;


public class d {
    public static void main(String[] args){
        String namapembeli;
        
        System.out.println("---------------------------------------------");
        System.out.println("            AYP Plaza < AP >");
        System.out.println("         Promo Belanja Berhadiah");
        System.out.println("     Khusus Pembelian 5 Barang Pertama");
        System.out.println("     Dengan harga minimum Rp 10000,00");
        System.out.println("---------------------------------------------");
        
        Scanner beli = new Scanner(System.in);
        System.out.print("Masukkan Nama Pembeli : ");
        namapembeli = beli.nextLine();
        
        int[] harga = new int[5];
        int total= 0;
        for (int j=0; j<harga.length; j++ ){
            System.out.print("Masukkan Harga Barang ke-"+ (j + 1) +" : ");
            harga[j] = beli.nextInt();
            total = total + harga[j];
        }
         System.out.println("Total harga pembelian atas nama " + namapembeli + " adalah Rp. " + total);

        // cek promo
        boolean promo = false;
        for (int a = 0; a < harga.length; a++) {
            promo = harga[a] >= 10000;
        }

        if (promo == true) {
            System.out.println("Selamat...");
            System.out.println("Anda mendapat hadiah 1 buah misteri box");
        } else {
            System.out.println("anda tidak mendapat promo");
        }

        System.out.println("---------------------------------------------");
        System.out.println("               Terima Kasih");
        System.out.println("     anda sudah berbelanja di AYP Plaza");
        
        
        
    }
}