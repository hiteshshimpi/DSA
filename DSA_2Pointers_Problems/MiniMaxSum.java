package DSA_2Pointers_Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MiniMaxSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        long result[]= new long[arr.length];
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long total = 0;


    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length;j++){
            if(i!=j)
            {
                total = total + arr[j];
            }
        }
        result[i]=total;
        total=0;
    }
        System.out.println(Arrays.toString(result));
        for(int i =0;i<result.length;i++)
        {
            if(result[i]>max)
            {
                max=result[i];
            }
            else if (result[i]<min)
            {
                min =result[i];
            }
        }
        System.out.println(max + " "+min);
















    }
}
