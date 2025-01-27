package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RebuildParts {
    public static void main(String[] args) {
        String [] parts ={"*===#","X_+++Z","#_______X","A......*"};
        //output ==AbcZ
       StringBuilder res = new StringBuilder();

        for(int i =0;i<parts.length;i++)
        {
            for(int j=0;j<parts[i].length();j++)
            {
                char val = parts[i].charAt(j);
                if(val == 'A')
                {

                    res.append(parts[i].charAt(0));
                }
                else if(val=='Z')
                {
                    res.append(parts[i].charAt(parts.length));
                }
                else
                {
                    res.append(parts[i].charAt(j));
                }
            }

        }
        System.out.println(res);
        HashSet<Character> hashSet = new HashSet<>();
        for (int i=0;i<res.length();i++){
            hashSet.add(res.charAt(i));
        }
        for (char c : hashSet) {
            System.out.print(c);
        }
    }

}
