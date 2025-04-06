package DSA_2Pointers_Problems;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = {2,5,6};
        int length = arr.length + arr1.length;
        int[] res = new int[length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr.length && j < arr1.length) {
            if (arr[i] < arr1[j]) {
                res[k++] = arr[i++];
            } else {
                res[k++] = arr1[j++];
            }
        }

        // Copy remaining elements of arr[]
        while (i < arr.length) {
            res[k++] = arr[i++];
        }

        // Copy remaining elements of arr1[]
        while (j < arr1.length) {
            res[k++] = arr1[j++];
        }

        System.out.println("Merged Array with Duplicates:");
        System.out.println(Arrays.toString(Arrays.copyOf(res, k)));
    }
}