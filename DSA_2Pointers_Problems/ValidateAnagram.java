package DSA_2Pointers_Problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValidateAnagram {
    public static void main(String[] args) {
        String s ="rat";
        String t ="aat";
        HashMap<Character,Integer> hash = new HashMap<>();
        if(s.length()!=t.length())
        {
            System.out.println("It is not Anagram");
            return;
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                if(!hash.containsKey(s.charAt(i)))
                {
                    hash.put(s.charAt(i),1);
                }
                else
                {
                    hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
                }
            }
            System.out.println(hash);
            Iterator<Map.Entry<Character,Integer>> iterator = hash.entrySet().iterator();
            while (iterator.hasNext())
            {
                Map.Entry<Character,Integer> entry = iterator.next();
            }
            for(int i=0;i<t.length();i++)
            {
                if(hash.containsKey(t.charAt(i)))
                {
                    hash.put(t.charAt(i),hash.get(t.charAt(i))-1);
                }
                else
                {
                    System.out.println("Not ANagaram ");
                    return;
                }
            }
            System.out.println(hash);
            for (int i : hash.values())
            {
                if(i!=0)
                {
                    System.out.println("Not anagram");
                    return;
                }

            }
                System.out.println("anagram");
        }
    }
}
