package DSA_2Pointers_Problems;

import java.util.List;
import java.util.stream.Collectors;

public class MarkToys {
    public static void main(String[] args) {
        int arr[] = {1, 12, 5, 111, 200, 1000, 10};
        int k = 50;
        toys(arr,k);
    }
        public static void toys(int [] arr, int k)
        {
            long budget = 0;
            int count = 0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]<k )
                {
                    budget=budget+arr[i];
                    if(budget<k)
                    {
                        count+=1;
                    }
                }
            }
            System.out.println(count);
            System.out.println(budget);
        }


        public static void toysMark(List<Integer> prices, int k)
        {
            long budget=0;
            int count=0;
            prices =prices.stream().sorted().collect(Collectors.toList());

            for(int i=0;i<prices.size();i++)
            {
                budget=budget+prices.get(i);
                if(budget<=k)
                {
                    count+=1;
                }
            }

        }
    }

