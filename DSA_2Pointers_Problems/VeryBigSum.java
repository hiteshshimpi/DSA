package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class VeryBigSum {
    public static void main(String[] args) {
        ArrayList<Long> ar = new ArrayList<Long>();
        int lenOfArr = 0;
        long sum =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Length of ARR: ");
        lenOfArr = in.nextInt();

        for (int i = 0; i < lenOfArr; i++) {
            System.out.println("Enter the Long Numbers :");
            ar.add(in.nextLong());
        }
        for(int i=0;i<ar.size();i++)
        {
            sum = sum + ar.get(i);
        }
        System.out.println(sum);
    }
}
