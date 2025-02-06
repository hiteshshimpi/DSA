package DSA_2Pointers_Problems;

public class HurdleRace {

    public static void main(String[] args) {
        int [] hurdles ={2 ,5, 4, 5, 2};
        int k=7;
        int max=Integer.MIN_VALUE;
        int hurdles_Pass=0;

        for(int i=0;i<hurdles.length;i++)
        {
            if(hurdles[i]>max)
            {
                max=hurdles[i];
            }
        }
        if(max<k)
        {
            System.out.println("0");
        }else
        {
            hurdles_Pass = max-k;
            System.out.println(hurdles_Pass);
        }

    }
}
