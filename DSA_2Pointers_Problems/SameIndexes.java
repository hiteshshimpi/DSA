package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameIndexes {


    public static void main(String[] args) {
        int [] a ={1,4,5,7};
        int b[] ={6,4,3,7};
        List<Integer> newList = new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==b[i])
            {
                newList.add(a[i]);
            }
        }
        System.out.println(Arrays.toString(newList.toArray()));
    }
}