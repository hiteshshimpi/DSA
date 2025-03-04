package DSA_2Pointers_Problems;

import java.util.*;

public class SalesByMatch {
    public static void main(String[] args) {

        HashMap<Integer,Integer> hash = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        //20 20 10 10 30 50 10 20
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(10);
        arr.add(10);
        arr.add(30);
        arr.add(50);
        arr.add(10);
        arr.add(20);
        int pairs=0;
        int pairCount =0;
        int value=0;
        for (int i = 0; i < arr.size(); i++) {
            if (!hash.containsKey(arr.get(i))) {
                hash.put(arr.get(i), 1);
            } else {
                hash.put(arr.get(i), hash.get(arr.get(i)) + 1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> it = hash.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getValue()>=2)
            {
                pairCount = (int) (Math.ceil(entry.getValue() / 2));
                    pairs=pairs+pairCount;
            }
        }
        System.out.println(pairCount);
        System.out.println(pairs);
    }
}