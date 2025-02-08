package DSA_2Pointers_Problems;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        List<Integer> arr =new ArrayList<>();
//11 4 11 7 13 4 12 11 10 14

  // 11 -1,
        // 4 -1,
        // 11 -1,
        // 7-1,
        // 3 ->1  ,
        // 7-1,
        // 10 -1,
        // 13-1,
        // 4 -1,
        // 8 ->1
        // 12 -1
        // 11 -1
        // 10 -1
        // 14 -1
        // 12 -1
        arr.add(11);arr.add(4);arr.add(11);arr.add(7);arr.add(13);arr.add(4);arr.add(12); arr.add(11) ;arr.add(10);arr.add(14);
        List<Integer> brr= new ArrayList<>();
        brr.add(11);brr.add(4);brr.add(11);brr.add(7);brr.add(3);brr.add(7);brr.add(10);brr.add(13);brr.add(4);brr.add(8);brr.add(12);brr.add(11);
        brr.add(10);
        brr.add(14);
        brr.add(12);
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i =0;i<brr.size();i++)
        {
            if(!hash.containsKey(brr.get(i)))
            {
                hash.put(brr.get(i),1);
            }
            else
            {
                hash.put(brr.get(i),hash.get(brr.get(i)) +1);
            }
        }
        for(int i =0;i<arr.size();i++)
        {
            if(hash.containsKey(arr.get(i)))
            {
                hash.put(arr.get(i),hash.get(arr.get(i))-1);
            }
        }

        Iterator<Map.Entry<Integer,Integer>> it = hash.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer,Integer> entry = it.next();
            if(entry.getValue()>0 || entry.getValue()<0)
            {
                System.out.println("Missing Key is : "+entry.getKey());
            }
        }
    }
}
