import java.util.Scanner;

/**
 *
 * @author asusAYP
 */
public class a {
        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int awal, akhir;
    
        System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Batas Nilai Awal : ");
        awal=input.nextInt();
        System.out.print("Masukan Batas Nilai Akhir : ");
        akhir=input.nextInt();
        System.out.println("--------------------------- ");

        System.out.println("Deret Bilangan Genap");
            for(int i=awal;i<=akhir;i++){
                if (i%2==0)
            System.out.print(i+" ");
        }
        System.out.println("");
    }    
}
