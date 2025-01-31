package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
       // 3 2 1 3

        candles.add(44);
        candles.add(53);
        candles.add(31);
        candles.add(27);
        candles.add(77);
        candles.add(60);
        candles.add(77);
        candles.add(77);
        candles.add(26);
        candles.add(36);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count=0;


        for(int i=0;i<candles.size();i++)
        {
            if(candles.get(i)>max)
            {
                max=candles.get(i);
            }
      }
        for(int i=0;i<candles.size();i++)
        {
            if(candles.get(i)==max){

                count+=1;
            }
        }
        System.out.println(max);
        System.out.println(candles);




















    }
}
