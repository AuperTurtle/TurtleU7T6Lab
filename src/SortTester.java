import java.util.Arrays;

public class SortTester {
    public static void main(String[] args) {
        System.out.println("--- SELECTION SORT --- ");
        int[] arr1 = {-1, 1, 2};
        // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
        Sort.selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("\n--- INSERTION SORT --- ");
        int[] arr2 = {-1, 1, 2};
        // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
        Sort.insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}