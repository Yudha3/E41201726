package Latihan;

import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("program kalkulator \n --------------------------");
        System.out.print("Masukan nilai 1 : ");
        int n1 = s.nextInt();
        System.out.print("Masukan nilai 2 : ");
        int n2 = s.nextInt();
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. %");
        System.out.print("Masukan operator[1-5] : ");
        s.nextLine();
        String op = s.nextLine();
        double hasil;
        if ("+".equals(op)) {
            hasil = n1 + n2;
            System.out.println("Hasil : " + hasil);
        } else if ("-".equals(op)) {
            hasil = n1 - n2;
            System.out.println("Hasil : " + hasil);
        } else if ("*".equals(op)) {
            hasil = n1 * n2;
            System.out.println("Hasil : " + hasil);
        } else if ("/".equals(op)) {
            hasil = n1 / n2;
            System.out.println("Hasil : " + hasil);
        } else if ("%".equals(op)) {
            hasil = n1 % n2;
            System.out.println("Hasil : " + hasil);
        } else {
            System.out.println("operator yang anda masukin tidak ada");
        }

    }
}
