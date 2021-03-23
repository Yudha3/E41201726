package Latihan;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("masukan nim : ");
        String nim = s.nextLine();

        if (null == nim) {
            System.out.println("nim yang anda masukan tidak ada");
        }

        switch (nim) {
            case "E41200036":
                System.out.println("NIM\t: E41200036");
                System.out.println("NAMA\t: MOH IBNU ABDURROHMAN SUTIO");
                break;
            case "E41200012":
                System.out.println("NIM\t: E41200012");
                System.out.println("NAMA\t: MOH IBNU ABDILLAH SUTIO");
                break;
            default:
                System.out.println("nim yang anda masukan tidak ada");
                break;
        }
    }
}
