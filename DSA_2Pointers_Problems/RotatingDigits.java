package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatingDigits {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int k = 2;
        rotateLeft(arr,k);
    }

        public static void rotateRight (int [] arr, int k) {



            if (k <= 0) {
                k = k + arr.length;
            } else {
                k = k % arr.length;
                System.out.println(k);
            }

            while (k != 0) {
                int temp = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    arr[i - 1] = arr[i];
                }
                arr[arr.length - 1] = temp;
                k--;
            }
            System.out.println(Arrays.toString(arr));
        }


        public static void  rotateLeft(int[ ] arr, int k)
        {
            int [] queries ={0,1,2};
            if (k <= 0) {
                k = k + arr.length;
            } else {
                k = k % arr.length;

            }

            while(k!=0)
            {
                int temp =arr[arr.length-1];
                    for(int i=arr.length-2;i>=0;i--){
                        arr[i+1]=arr[i];
                    }
                    arr[0]=temp;
                k--;
            }

            for(int i =0;i<queries.length;i++)
            {
                int j =queries[i];
                System.out.println(arr[j]);
            }
            System.out.println("*******************");
            System.out.println(Arrays.toString(arr));
        }











    }
