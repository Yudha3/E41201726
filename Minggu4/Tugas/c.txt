import java.util.Scanner;

/**
 *
 * @author asusAYP
 */
public class c {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.print("Masukan Banyaknya Data Nilai : ");
     int angka = input.nextInt();
     int[] nilai = new int[angka];
        int count = 0;
        int sum = 0;
        int avg = 0;
        int min = 0;
        int max = 0;

        // input nilai
        for (int j = 0; j < angka; j++) {
            System.out.print("nilai ke-" + (j+1) + " : ");
            nilai[j] = input.nextInt();
        }
        min = nilai[0];
        max = nilai[0];
         for(int i=0;i<nilai.length;i++){
            sum += nilai[i]; 
            count++; 
            if(nilai[i] > max){ 
                max = nilai[i];
            }else if(nilai[i] < min){ 
                min = nilai[i];
            }
            
        }
        System.out.println(" ");
        System.out.println("Nilai Minimal : " + min);
        System.out.println("Nilai Maximal : " + max);
        
        avg = sum / count; 
        System.out.println("Nilai rata ratanya adalah = " + avg);
        
    }
}
