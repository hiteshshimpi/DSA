package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge4 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,1,3,1,2 ));
        int count=0;

        for(int i=0;i<=arr.size()-2;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr.get(j)<arr.get(j-1))
                {
                    Collections.swap(arr,j,j-1);
                    count++;
                }
                else
                {
                    break;
                }
            }

        }
        String formatted = arr.toString()
                .replace(",","")
                .replace("[","")
                .replace("]","")
                .trim();
        System.out.println(formatted);
        System.out.println("Count of nuber of swaps is : "+count);
    }
}
