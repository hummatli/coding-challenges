package sorting_algorithms;

import java.util.Scanner;

public class QuickSort {



    public static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void quicksort(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }
        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index - 1);
        quicksort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right ) {
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //------------------------------------------------------------------------
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Insert array: ");

        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[aItems.length];

        for (int i = 0; i < aItems.length; i++) {
            arr[i] = Integer.parseInt(aItems[i]);
        }

        quicksort(arr);

        scanner.close();
    }
}
