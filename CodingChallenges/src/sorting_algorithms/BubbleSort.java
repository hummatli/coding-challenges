package sorting_algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;

        while (!isSorted) {

            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

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

        bubbleSort(arr);

        scanner.close();
    }
}
