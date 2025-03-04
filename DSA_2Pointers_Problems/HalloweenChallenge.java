package DSA_2Pointers_Problems;

public class HalloweenChallenge {
    public static void main(String[] args) {
       // 100 1 1 99
        int p = 100;
        int d = 1;
        int m = 1;
        int s = 99;
        int discounted_value = 0;
        int count = 0;
        while(p>0 && discounted_value<s )
        {

            if(p-d>m)
            {
                discounted_value =discounted_value+p;
                p =(p-d);
                count++;
            }
            else if(discounted_value +m <s)
            {
                discounted_value = discounted_value + m;
            count++;
            }
            else
            {
                break;
            }
        }
        System.out.println(count);
        System.out.println(discounted_value);

    }


}



     /* while(p>0 && discounted_value<s )
        {

        if(p<=m) {
        discounted_value = discounted_value + m;
        count++;
        }
        else
        {
        discounted_value =discounted_value+p;
        p =(p-d);
        count++;
        }

        }
        System.out.println(count);
        System.out.println(discounted_value);
*/