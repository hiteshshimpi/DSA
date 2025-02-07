package DSA_2Pointers_Problems;

public class FindDigits {
    public static void main(String[] args) {
        int n=123456789;
        int k =n;
        int count=0;
        while(n!=0)
        {
            int rem = n % 10;
            if(rem!=0)
            {
                if(k % rem ==0)
                {
                    count+=1;
                }
            }

            n = n /10;
        }
        System.out.println(count);
    }
}
