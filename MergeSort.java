
/**
 Реализовать алгоритм сортировки слиянием
 */
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 3, 9, 1, 8, 9};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] array = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                array[k] = arr1[i];
                i++;
            } else {
                array[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            array[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            array[k] = arr2[j];
            j++;
            k++;
        }
        return array;
    }

}