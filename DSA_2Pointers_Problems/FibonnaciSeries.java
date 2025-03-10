package DSA_2Pointers_Problems;

public class FibonnaciSeries {

    public static void main(String[] args) {
        int n  =8;
        int a =0;
        int b =1;

        while(n>0)
        {
            int sum = a+b;
            a =b;
            b = sum;
            System.out.println(sum);
            n--;
        }
    }
}
