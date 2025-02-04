package DSA_2Pointers_Problems;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MigratingBirds {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        HashMap<Integer, Integer> hash = new HashMap<>();
        int value = 0;
        int keyValue = 0;

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
            if (value < entry.getValue()) {
                value = entry.getValue();
                keyValue = entry.getKey();
            }

        }
        System.out.println(keyValue);


    }
}