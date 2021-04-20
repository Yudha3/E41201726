import java.util.Arrays;
//import java.util.Scanner;
/**
 *
 * @author AYP
 */
public class C {
    public static void main(String[] args)
    {  
        int inputArr[] = {5, 2, 4, 6, 1, 3};
        //    Tampilkan Data Sebelum di sorting
        System.out.println();
        System.out.print("Data Sebelum di Sorting : " + Arrays.toString(inputArr));
         
        //    Proses Selection Sort
        int n = inputArr.length;
        System.out.println("\n\nProses Selection Sort");
        for(int x = 0; x < n-1; x++) {
            System.out.println("Iterasi ke-"+(x+1)+" : ");
            for(int y = 0; y < n; y++)
                System.out.print(inputArr[y]+" ");
             
            System.out.println("   Apakah Data "+inputArr[x]+" sudah benar pada urutannya?");
             
            boolean tukar = false;
            int index = 0;
            int min = inputArr[x];
            String pesan = "   Tidak Ada Pertukaran";
            for(int y = x+1; y < n; y++) {
                if(min > inputArr[y]) {
                    tukar = true;
                    index = y;
                    min = inputArr[y];
                }
            }
             
            if(tukar == true) {
                //    Pertukaran Data
                pesan = "   Data "+inputArr[x]+" ditukar dengan Data "+inputArr[index];
                int temp = inputArr[x];
                inputArr[x] = inputArr[index];
                inputArr[index] = temp;
            }
             
            for(int y = 0; y < n; y++)
                System.out.print(inputArr[y]+" ");
             
            System.out.println(pesan+"\n");
        }
         
        //    Tampilkan Data Setelah di Sorting
        System.out.print("Data Setelah di sorting : ");
        for(int x = 0; x < n; x++)
            System.out.print(inputArr[x]+" ");
    }
}
/*
        //    Buat Objek Scanner
        Scanner scan = new Scanner(System.in);
         
        //    Input jumlah Data
        System.out.print("Masukkan jumlah Data : ");    
        int jlh_data = scan.nextInt();
         
        //    Input nilai tiap Data
        int[] data = new int[jlh_data];        //    Array untuk nilai tiap Data
        System.out.println();
        for(int x = 0; x < jlh_data; x++)
        {
            System.out.print("Input nilai Data ke-"+(x+1)+" : ");
            data[x] = scan.nextInt();
        }*/
