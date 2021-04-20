
import java.util.Arrays;

/**
 *
 * @author AYP
 */
public class SelectionSort {
    static int[] selectionSort(int[] inputArr){
        int n = inputArr.length;
        
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i+1; j< n; j++) {
                if(inputArr[j] < inputArr[min]) {
                    min=j;
                }
            }
            if(min != i) {
                int temp = inputArr[i];
                inputArr[i] = inputArr[min];
                inputArr[min] = temp;
            }
        }
        return inputArr;
    }
    
    public static void main(String[] args) {
        int inputArr[] = {5, 2, 4, 6, 1, 3};
        selectionSort(inputArr);
        System.out.print(Arrays.toString(inputArr));
    }
}
