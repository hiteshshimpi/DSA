package DSA_2Pointers_Problems;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int [] arr = {4,5,5,5,4,6,6,4,9,4,2,1,3};
        Set<Integer> arrSet = new HashSet<>();
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            arrSet.add(arr[i]);
        }
        System.out.println(arrSet);


        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0;i<arr.length;i++)
        {
            if(!arrayList.contains(arr[i]))
            {
                arrayList.add(arr[i]);
            }
            if (!hash.containsKey(arr[i]))
            {
                hash.put(arr[i],1);
            }
            else
            {
                hash.put(arr[i],hash.get(arr[i])+1);
            }
        }
        System.out.println("With arraylist : " +arrayList);
        System.out.println(hash);
    }
}
