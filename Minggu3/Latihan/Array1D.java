package Latihan;

public class Array1D {

    public static void main(String[] args) {
        int[] angkaRandom = {2, 4, 2, 6, 8, 6, 44, 1, 3, 11, 37, 99};
        String[] siswa = {"ibnu", "jhon", "april", "arip"};

        // output array angka random
        System.out.print("Array angka random : ");
        System.out.print("[ ");
        for (int data : angkaRandom) {
            System.out.print(data + " ");
        }
        System.out.println("]");

        // output array siswa
        System.out.print("Array siswa : ");
        System.out.print("[ ");
        for (String data : siswa) {
            System.out.print(data + " ");
        }
        System.out.println("]");
    }
}
