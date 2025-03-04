package DSA_2Pointers_Problems;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr [] = {3,4,7,5,6,2,1};

        for(int i =0;i<=arr.length-2;i++)
        {
           // System.out.println(Arrays.toString(arr));
            int temp;
            for(int  j=i+1;j>0;j--)
            {

                if(arr[j]<arr[j-1])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
                else {
                    break;
                }

            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
