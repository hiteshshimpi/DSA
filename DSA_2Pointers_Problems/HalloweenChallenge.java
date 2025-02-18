package DSA_2Pointers_Problems;

public class HalloweenChallenge {
    public static void main(String[] args) {
        int p=20;
        int d=3;
        int m=6;
        int s=85;
        int discounted_value=0;
        int count=0;

        while(p>0 && discounted_value<s )
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
        }

    }

