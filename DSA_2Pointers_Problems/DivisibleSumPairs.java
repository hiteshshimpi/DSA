package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int k=3;
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);
  int pairCount=0;
  int sum=0;

  for(int i=0;i<ar.size();i++)
  {
      for(int j=i+1;j<ar.size();j++)
      {
            sum = ar.get(i)+ar.get(j);

            if(sum==k || sum % k ==0)
            {
                pairCount+=1;
            }
      }

  }
        System.out.println(pairCount);














    }
}
