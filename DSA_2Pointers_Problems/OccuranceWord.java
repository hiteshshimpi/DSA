package DSA_2Pointers_Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccuranceWord {

    public static void main(String[] args) {
        HashMap<String,Integer> hash = new HashMap<>();
        String s = "My name is Hitesh Hitesh Shimpi";
        System.out.println(s);
        String [] names = s.split(" ");
        System.out.println(Arrays.toString(names));
        for(int i=0;i<names.length;i++)
        {
            if(!hash.containsKey(names[i]))
            {
                hash.put(names[i],1);
            }else
            {
                hash.put(names[i],hash.get(names[i])+1);
            }
        }
        System.out.println(hash);

        Iterator<Map.Entry<String,Integer>> entryIterator = hash.entrySet().iterator();
        while (entryIterator.hasNext())
        {
            Map.Entry<String,Integer> entry = entryIterator.next();
            System.out.println("The "+entry.getKey()+" Occured "+entry.getValue()+" times in a Sentence");
        }
    }
}
