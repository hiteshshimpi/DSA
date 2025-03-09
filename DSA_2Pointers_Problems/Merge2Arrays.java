package DSA_2Pointers_Problems;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {

        int [] arr1 ={1,2,3};
        int [] arr2={4,5,6};
        int [] arr3 = new int[arr1.length+arr2.length];
        System.out.println(Arrays.toString(arr3));
            int len =arr3.length;
            for(int i=0;i<arr1.length;i++)
            {
                arr3[i]=arr1[i];
            }
        System.out.println(Arrays.toString(arr3));
            int n =arr1.length;
            for(int i =0;i<arr2.length;i++)
            {
                arr3[n]=arr2[i];
                n++;
            }
        System.out.println(Arrays.toString(arr3));
    }
}
