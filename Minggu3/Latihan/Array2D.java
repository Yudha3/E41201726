package Latihan;

public class Array2D {

    public static void main(String[] args) {
        int[][] number = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},};
        System.out.print("[ ");
        for (int[] is : number) {
            for (int i : is) {
                System.out.print(i + " ");
            }
        }
        System.out.println("]");
    }
}
