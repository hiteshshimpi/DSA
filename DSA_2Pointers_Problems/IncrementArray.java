package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IncrementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =0;
        int n = 3;
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Character in array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++)
        {
           num  = (num *10+arr[i]);
        }
        System.out.println(num);
        num =num +1;
        System.out.println(num);
        while(num>0)
        {
            list.add(0,num%10);
            num = num /10;
        }
        System.out.println(list);
    }
}