package DSA_2Pointers_Problems;

public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        int num1 = 121;
        int sum=0;
        while(x>0)
        {
            int rem = x % 10;
            sum = rem + 10 *sum;
            x =x /10;
        }
        if(sum==num1)
        {
            System.out.println("It is palindrome");
            System.out.println(sum);
        }
        else
        {
            System.out.println("It is not a palindrome");
            System.out.println(sum);
        }
    }
}
