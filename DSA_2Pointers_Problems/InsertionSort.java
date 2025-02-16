package DSA_2Pointers_Problems;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr [] = {2,4,6,8,3};

        for(int i =0;i<=arr.length-2;i++)
        {
            int temp;
            for(int  j=i+1;j>0;j--)
            {
                System.out.println(Arrays.toString(arr));
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
        }
        System.out.println(Arrays.toString(arr));
    }
}
