package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Practice2 {
    public static void main(String[] args) {
        evenNum();
    }

    public static void arryListQuestion ()
        {
            ArrayList<Object> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
            ArrayList<Object> arr_2 = new ArrayList<>(Arrays.asList(4, 5));
            arr.add(arr_2);
            System.out.println(arr.size());
            System.out.println(arr);

        }



    public static void evenNum()
    {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        for(int i=0;i< num.size();i++)
        {
            int number = num.get(i);
            if(number %2 ==0){
                num.add(number);
            }
        }
        System.out.println(num);

    }
    }
