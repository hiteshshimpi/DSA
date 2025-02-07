package DSA_2Pointers_Problems;

public class BeautifulDays {
    public static void main(String[] args) {
        int start=49860;
        int end=205494;
        int k=155635764;
    withWhile(start,end,k);
    }

    public static void withWhile(int s,int j, int k)
    {
        int count=0;
        for(int start=s;start<=j;start++){
            int num=start;
            int rev=0;
            while(num!=0){
                int rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            int diff= Math.abs(start-rev);
            if(diff%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
    }


