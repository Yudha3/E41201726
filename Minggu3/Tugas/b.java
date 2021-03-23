import java.util.Scanner;


public class b {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah deretan array : ");
        int angka = scan.nextInt();
        int[] angkaAcak = new int[angka];

        // input nilai
        for (int j = 0; j < angka; j++) {
            System.out.print("nilai ke-" + j + " : ");
            angkaAcak[j] = scan.nextInt();
        }

        // output nilai
        System.out.print("Nilai array : ");
        System.out.print(" [ ");
        for (int j : angkaAcak) {
            System.out.print(j + " ");
        }
        System.out.println("]");
         
         }
     
}