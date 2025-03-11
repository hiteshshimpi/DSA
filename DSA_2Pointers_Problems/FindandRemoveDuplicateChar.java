package DSA_2Pointers_Problems;

import java.util.*;

public class FindandRemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "hackerearth";
        HashMap<Character, Integer> hash = new HashMap<>();
        ArrayList<Character> ar = new ArrayList<>();
        String newStr =" ";
        for (int i = 0; i < str.length(); i++) {
            if (!hash.containsKey(str.charAt(i))) {
                hash.put(str.charAt(i), 1);
            } else {
                hash.put(str.charAt(i), hash.get(str.charAt(i)) + 1);
            }
        }
        System.out.println(hash);
        for (int i =0;i<str.length();i++)
        {
            if(hash.containsKey(str.charAt(i)))
            {
                if(hash.get(str.charAt(i))==2 && !ar.contains(str.charAt(i))){
                        ar.add(str.charAt(i));
                    //System.out.println(ar);
                }
            }
        }
        System.out.println(Arrays.toString(ar.toArray()));

    }
}