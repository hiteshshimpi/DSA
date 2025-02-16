package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>(Arrays.asList(1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13 ,14 ,15 ,16 ,17 ,18 ,19 ,20));
        int v=10;
        int start =0;
        int end = ls.size();

        while(start<=end)
        {
            int mid = start+(end-start) / 2;

            if(ls.get(mid).equals(v))
            {
                System.out.println(mid);
                break;
            }
            if(v<ls.get(mid))
            {
                end = mid-1;
            }
            else
            {
                start =mid+1;

            }
        }
    }
}
