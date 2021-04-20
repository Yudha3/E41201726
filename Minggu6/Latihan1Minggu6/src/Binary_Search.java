
import java.util.Scanner;

/**
 *
 * @author AYP
 */
public class Binary_Search {

    public static void sorting(int[] intarray) {
        int temp = 0;
        for (int x = 0; x < intarray.length; x++) {
            for (int y = 0; y < intarray.length; y++) {
                if (x == y) {
                    continue;
                } else {
                    if (intarray[x] < intarray[y]) {
                        temp = intarray[y];
                        intarray[y] = intarray[x];
                        intarray[x] = temp;

                    }
                }
            }
        }
    }

    public static void main(String[] Args) {
        int k, angka;
        System.out.println("Program Binary Search");
        System.out.println();
        System.out.print("Kumpulan data Array of Random : ");
        boolean notfound = true;
        int[] intarray = {2, 9, 6, 7, 4, 5, 3, 1};

        for (int i = 0; i < intarray.length; i++) {
            System.out.print(intarray[i] + " ");
        }

        //	Proses sorting
        sorting(intarray);

        //	Menampilkan Data setelah di sorting
        System.out.println();
        System.out.print("Sorting : ");
        for (int x = 0; x < intarray.length; x++) {
            System.out.print(intarray[x] + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukan angka yang ingin dicari = ");
        angka = sc.nextInt();

        int batasAtas = intarray.length - 1;
        int batasBawah = 0;

        while (notfound) {
            int posisiSekarang = (batasAtas + batasBawah) / 2;
            if (intarray[posisiSekarang] == angka) {
                notfound = false;
                System.out.println("Angka " + angka + " ditemukan pada index ke-" + posisiSekarang);
            } else if (batasBawah > batasAtas) {
                System.out.println("Angka " + angka + " tidak ditemukan");
                break;
            } else {
                if (intarray[posisiSekarang] < angka) {
                    batasBawah = posisiSekarang + 1;
                } else {
                    batasAtas = posisiSekarang - 1;
                }
            }
        }
    }
}
