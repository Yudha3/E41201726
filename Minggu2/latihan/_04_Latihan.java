
package latihan;

import java.util.Scanner;

public class _04_Latihan {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Aplikasi Penjumlahan");
        
        System.out.print("Masukan nilai 1: ");
        int nilai1 = s.nextInt();
        
        System.out.print("Masukan nilai 2: ");
        int nilai2 = s.nextInt();
        
        // Penghitungan
        int hasil = nilai1 + nilai2;
        System.out.println("Hasil : " + hasil);
        
        
    }
}
